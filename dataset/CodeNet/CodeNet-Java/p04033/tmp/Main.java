import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int a=s.nextInt(),b=s.nextInt();
System.out.println("[INST]6;a;s.nextInt();"+a);
System.out.println("[INST]6;b;s.nextInt();"+b);
		if(a<=0&&0<=b)
			System.out.println("Zero");
		else
			System.out.println((Math.min(0,b)-Math.min(-1,a))%2==1?"Positive":"Negative");
	}
}
