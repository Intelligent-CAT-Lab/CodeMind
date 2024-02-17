import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int n, i, j, factorial;
		String str;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			factorial = (int) (Math.pow(2, n));
			char[] cha = new char[n];
			for(i = 0; i < factorial; i++) {
				str = Integer.toBinaryString(i);
				for(j = 0; j < str.length(); j++) {
					cha[j] = str.charAt(j);
				}
				System.out.print(i + ":");
				for(j = 0; j < str.length(); j++) {
					if(cha[str.length() - j - 1] == '1') {
						System.out.print(" " + j);
					}
				}
				System.out.println();
			}
		}
	}
}

