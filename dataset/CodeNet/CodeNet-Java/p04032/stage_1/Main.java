import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(System.in);
		String line;
var newVariable_0 = cin.hasNext();		for (; newVariable_0;) {
			line = cin.nextLine();

			String[] strArray = line.split("");
			int resultNum1 = -1;
			int resultNum2 = -1;

			for(int i =0; i < strArray.length; i++){

var newVariable_1 = strArray[i].equals(strArray[i + 1]);				if(i + 1 <= strArray.length - 1 && newVariable_1){
					resultNum1 = i + 1;
					resultNum2 = i + 2;
					break;
				}


var newVariable_2 = strArray[i].equals(strArray[i + 2]);				if(i + 2 <= strArray.length - 1 && newVariable_2){
					resultNum1 = i + 1;
					resultNum2 = i + 3;
					break;
				}
			}


			System.out.println(resultNum1 + " " + resultNum2);
		}
	}
}