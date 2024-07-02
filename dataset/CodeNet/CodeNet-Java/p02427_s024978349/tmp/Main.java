import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int n, i, j, factorial;
		String str;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
System.out.println("[INST]7;n;sc.nextInt();"+n);
			factorial = (int) (Math.pow(2, n));
System.out.println("[INST]8;None;Math.pow(2, n);"+Math.pow(2, n));
			char[] cha = new char[n];
			for(i = 0; i < factorial; i++) {
				str = Integer.toBinaryString(i);
System.out.println("[INST]11;str;Integer.toBinaryString(i);"+str);
				for(j = 0; j < str.length(); j++) {
System.out.println("[INST]12;None;str.length();"+str.length());
					cha[j] = str.charAt(j);
System.out.println("[INST]13;None;str.charAt(j);"+str.charAt(j));
				}
				System.out.print(i + ":");
				for(j = 0; j < str.length(); j++) {
System.out.println("[INST]16;None;str.length();"+str.length());
					if(cha[str.length() - j - 1] == '1') {
System.out.println("[INST]17;None;str.length();"+str.length());
						System.out.print(" " + j);
					}
				}
				System.out.println();
			}
		}
	}
}

