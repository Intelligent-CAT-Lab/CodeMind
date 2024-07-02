import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
		int c = sc.nextInt();
System.out.println("[INST]7;c;sc.nextInt();"+c);
		String StringA = String.valueOf(a);
System.out.println("[INST]8;StringA;String.valueOf(a);"+StringA);
		String StringB = String.valueOf(b);
System.out.println("[INST]9;StringB;String.valueOf(b);"+StringB);
		String StringC = String.valueOf(c);
System.out.println("[INST]10;StringC;String.valueOf(c);"+StringC);
		
		if (a >= b && a >= c) {
			if (b  >= c) {
				System.out.println(Integer.parseInt(StringA + StringB)+ c);
			} else  {
				System.out.println(Integer.parseInt(StringA + StringC)+ b);
			}
		} else if (b>=a && b >= c){
			if (a>=c) {
				System.out.println(Integer.parseInt(StringB + StringA) + c);
			} else {
				System.out.println(Integer.parseInt(StringB + StringC)+a);	
			}
		} else {
			if(a>= b) {
				System.out.println(Integer.parseInt(StringC + StringA)+b);
			} else {
				System.out.println(Integer.parseInt(StringC + StringB)+a);
			}
		}

	}
}
