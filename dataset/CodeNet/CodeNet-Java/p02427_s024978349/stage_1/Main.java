import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int n, i, j, factorial;
		String str;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
var newVariable_0 = Math.pow(2, n);			factorial = (int) (newVariable_0);
			char[] cha = new char[n];
			for(i = 0; i < factorial; i++) {
				str = Integer.toBinaryString(i);
var newVariable_1 = str.length();				for(j = 0; j < newVariable_1; j++) {
var newVariable_2 = str.charAt(j);					cha[j] = newVariable_2;
				}
				System.out.print(i + ":");
var newVariable_3 = str.length();				for(j = 0; j < newVariable_3; j++) {
var newVariable_4 = str.length();					if(cha[newVariable_4 - j - 1] == '1') {
						System.out.print(" " + j);
					}
				}
				System.out.println();
			}
		}
	}
}

