import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),t=scan.nextInt();
System.out.println("[INST]6;x;scan.nextInt();"+x);
System.out.println("[INST]6;t;scan.nextInt();"+t);
		if(x>t) {
			System.out.println(x-t);
		}
		else if(x<=t) {
			System.out.println("0");
		}

	}

}