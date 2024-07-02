import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
System.out.println("[INST]5;W;sc.nextInt();"+W);
		int a = sc.nextInt();
System.out.println("[INST]6;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]7;b;sc.nextInt();"+b);
		if(a+W<b) {
			System.out.println(b-a-W);
		}else if(b+W<a) {
			System.out.println(a-b-W);
		}else{
			System.out.println("0");
		}
	}
}