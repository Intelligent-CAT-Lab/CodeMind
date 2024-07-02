import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(System.in);
		String line;
		for (; cin.hasNext();) {
System.out.println("[INST]7;None;cin.hasNext();"+cin.hasNext());
			line = cin.nextLine();
System.out.println("[INST]8;line;cin.nextLine();"+line);

			String[] strArray = line.split("");
System.out.println("[INST]10;strArray;line.split('');"+strArray);
			int resultNum1 = -1;
			int resultNum2 = -1;

			for(int i =0; i < strArray.length; i++){

				if(i + 1 <= strArray.length - 1 && strArray[i].equals(strArray[i + 1])){
System.out.println("[INST]16;None;strArray[i].equals(strArray[i + 1]);"+strArray[i].equals(strArray[i + 1]));
					resultNum1 = i + 1;
					resultNum2 = i + 2;
					break;
				}


				if(i + 2 <= strArray.length - 1 && strArray[i].equals(strArray[i + 2])){
System.out.println("[INST]23;None;strArray[i].equals(strArray[i + 2]);"+strArray[i].equals(strArray[i + 2]));
					resultNum1 = i + 1;
					resultNum2 = i + 3;
					break;
				}
			}


			System.out.println(resultNum1 + " " + resultNum2);
		}
	}
}