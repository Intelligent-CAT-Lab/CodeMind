import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
System.out.println("[INST]6;S;scan.nextLine();"+S);
		if(S.length()==1) {
System.out.println("[INST]7;None;S.length();"+S.length());
			System.out.println(S);
			System.exit(0);
System.out.println("[INST]9;None;System.exit(0);"+System.exit(0));
		}
		int[] N = new int[S.length()];
System.out.println("[INST]11;None;S.length();"+S.length());

		int patternCount = 1;
		String tmpBit = "";
		for(int i=0; i<N.length; i++) {
			N[i] = Integer.parseInt(String.valueOf(S.charAt(i)));
System.out.println("[INST]16;None;Integer.parseInt(String.valueOf(S.charAt(i)));"+Integer.parseInt(String.valueOf(S.charAt(i))));
System.out.println("[INST]16;None;String.valueOf(S.charAt(i));"+String.valueOf(S.charAt(i)));
System.out.println("[INST]16;None;S.charAt(i);"+S.charAt(i));
			if(i>0) {
				patternCount*=2;
				tmpBit = tmpBit + "1";
			}
		}

		long sum=0;
		for(int i=0; i<patternCount; i++) {
			String bin = Integer.toBinaryString(i);
System.out.println("[INST]25;bin;Integer.toBinaryString(i);"+bin);
			while(bin.length()<tmpBit.length()) {
System.out.println("[INST]26;None;bin.length();"+bin.length());
System.out.println("[INST]26;None;tmpBit.length();"+tmpBit.length());
				bin = "0" + bin;
			}
			String add = String.valueOf(N[0]);
System.out.println("[INST]29;add;String.valueOf(N[0]);"+add);
			for(int j=0; j<bin.length(); j++) {
System.out.println("[INST]30;None;bin.length();"+bin.length());
				if(bin.charAt(j)=='1') {
System.out.println("[INST]31;None;bin.charAt(j);"+bin.charAt(j));
					sum+=Integer.parseInt(add);
System.out.println("[INST]32;sum;Integer.parseInt(add);"+sum);
					add = "";
				}
				add = add + N[j+1];
			}
			if(add.length()>0) {
System.out.println("[INST]37;None;add.length();"+add.length());
				//System.out.printf("sum:%d + add:%s = ",sum, add);
				sum+=Long.parseLong(add);
System.out.println("[INST]39;sum;Long.parseLong(add);"+sum);
				//System.out.println(sum);
			}
		}
		System.out.println(sum);

	}

}
