import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		String S = input.nextLine();
System.out.println("[INST]5;S;input.nextLine();"+S);
		input.close();
		String correct = "CODEFESTIVAL2016";
		int num = 0;
		for(int i = 0; i < 16;i++){
			if(S.charAt(i) != correct.charAt(i)) num++;
System.out.println("[INST]10;None;S.charAt(i);"+S.charAt(i));
System.out.println("[INST]10;None;correct.charAt(i);"+correct.charAt(i));
		}
		System.out.println(num);
	}

}
