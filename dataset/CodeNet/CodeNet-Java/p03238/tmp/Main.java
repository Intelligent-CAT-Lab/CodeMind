import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
System.out.println("[INST]5;n;fs.nextInt();"+n);
		if(n == 1)System.out.println("Hello World");
		else {
			int a = fs.nextInt(),b = fs.nextInt();
System.out.println("[INST]8;a;fs.nextInt();"+a);
System.out.println("[INST]8;b;fs.nextInt();"+b);
			System.out.println(a+b);
		}
		fs.close();
	}
}