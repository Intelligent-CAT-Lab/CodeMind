import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
System.out.println("[INST]10;str;br.readLine();"+str);

		while(str.contains("()")){
System.out.println("[INST]12;None;str.contains('()');"+str.contains("()"));
			str = str.replaceAll("\\(\\)", "");
System.out.println("[INST]13;str;str.replaceAll('\\(\\)', '');"+str);
		}
		//System.out.println(str);
		char[] input = str.toCharArray();
System.out.println("[INST]16;input;str.toCharArray();"+input);

		int starIndex = 0;

		for(int i = 0; i < input.length; i++){
			if(input[i] == '*'){
				starIndex = i;
			}
		}

		int left = starIndex - 1;
		int right = starIndex + 1;

		int result = 0;
		while(left >= 0){
			if(input[left] == '('){
				while(right <= input.length - 1){
					if(input[right] == ')'){
						result++;
						break;
					}

					right++;
				}
			}

			left--;
		}

		System.out.println(result);
	}

}

