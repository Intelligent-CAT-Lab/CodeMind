import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
var newVariable_0 = S.length();		if(newVariable_0==1) {
			System.out.println(S);
			System.exit(0);
		}
var newVariable_1 = S.length();		int[] N = new int[newVariable_1];

		int patternCount = 1;
		String tmpBit = "";
		for(int i=0; i<N.length; i++) {
var newVariable_2 = Integer.parseInt(String.valueOf(S.charAt(i)));var newVariable_3 = String.valueOf(S.charAt(i));var newVariable_4 = S.charAt(i);			N[i] = Integer.parseInt(String.valueOf(newVariable_4));
			if(i>0) {
				patternCount*=2;
				tmpBit = tmpBit + "1";
			}
		}

		long sum=0;
		for(int i=0; i<patternCount; i++) {
			String bin = Integer.toBinaryString(i);
var newVariable_5 = bin.length();var newVariable_6 = tmpBit.length();			while(bin.length()<newVariable_6) {
				bin = "0" + bin;
			}
			String add = String.valueOf(N[0]);
var newVariable_7 = bin.length();			for(int j=0; j<newVariable_7; j++) {
var newVariable_8 = bin.charAt(j);				if(newVariable_8=='1') {
					sum+=Integer.parseInt(add);
					add = "";
				}
				add = add + N[j+1];
			}
var newVariable_9 = add.length();			if(newVariable_9>0) {
				//System.out.printf("sum:%d + add:%s = ",sum, add);
				sum+=Long.parseLong(add);
				//System.out.println(sum);
			}
		}
		System.out.println(sum);

	}

}
