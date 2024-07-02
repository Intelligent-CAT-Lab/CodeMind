import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner d = new Scanner(System.in);
		int a = d.nextInt();
System.out.println("[INST]4;a;d.nextInt();"+a);
		int b = d.nextInt();
System.out.println("[INST]5;b;d.nextInt();"+b);
		double c;
		c=(a*b*1.0/(a+b));
		System.out.println(c);
	}
}