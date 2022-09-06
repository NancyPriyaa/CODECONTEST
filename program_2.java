import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;

public class program_2{

	public static void remove_trash(String document) {

		// Your logic goes here

		ArrayList<String> trash = new ArrayList<>();
		trash.add("Null");
		trash.add("Spam");
		trash.add("Block");

		String info = "";
		File files[] = (new File(document)).listFiles();

		for(File file: files) {
			try {
				info = Files.readString(Paths.get(file.getAbsolutePath()));
			
				for(String a: trash)
					info = info.replace(a, "");
				
				FileWriter filewriter = new FileWriter(file);
				filewriter.write(info);
				filewriter.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws Exception {
		String document = "C:/notes";

		remove_trash(document);
	}

}