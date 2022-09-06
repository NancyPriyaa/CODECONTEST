import java.util.ArrayList;
import java.util.List;

public class program_1 {

	public static List<String> splitString(String str1, char b) {
		List<String> answer = new ArrayList<String>();

		// Your Logic goes here

		String current = "";
		for(char a: str1.toCharArray()) {
			if(a == b) {
				answer.add(current);
				current = "";
				continue;
			}
			current += a;
		}

		if(!(current.equals(""))) {
			answer.add(current);
		}

		return answer;
	}

	public static void main(String[] args) {
		String str1 = "My name is 'Ashok Kumar Gowda' I have 12+ years of experience I work for 'IBM India Pvt Ltd' ";

		List<String> answer = splitString(str1, '\'');

		for (String str2 : answer) {
			System.out.println(str2);
		}
	}
}
