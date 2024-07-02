import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
System.out.println("[INST]4;n;scan.nextInt();"+n);
		int a = scan.nextInt();
System.out.println("[INST]5;a;scan.nextInt();"+a);
		int b = scan.nextInt();
System.out.println("[INST]6;b;scan.nextInt();"+b);
		int count = 0;
		
		for(int i = 1; i <= n; i++){
			int sum = 0;
			for(int j = 0; j < String.valueOf(i).length(); j++){
System.out.println("[INST]11;None;String.valueOf(i).length();"+String.valueOf(i).length());
System.out.println("[INST]11;None;String.valueOf(i);"+String.valueOf(i));
				sum += String.valueOf(i).charAt(j)-'0';
System.out.println("[INST]12;None;String.valueOf(i).charAt(j);"+String.valueOf(i).charAt(j));
System.out.println("[INST]12;None;String.valueOf(i);"+String.valueOf(i));
			}
			if(a <= sum && sum <= b)count += i;
		}
		System.out.println(count);
	}
}