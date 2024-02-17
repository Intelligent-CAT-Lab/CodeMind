import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		String S = input.nextLine();
		input.close();
		String correct = "CODEFESTIVAL2016";
		int num = 0;
		for(int i = 0; i < 16;i++){
			if(S.charAt(i) != correct.charAt(i)) num++;
		}
		System.out.println(num);
	}

}
