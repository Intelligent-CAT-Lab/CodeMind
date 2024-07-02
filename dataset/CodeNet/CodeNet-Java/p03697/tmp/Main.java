import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
		if (a + b >= 10) {
    		System.out.println("error"); 
		}
		else {
		    System.out.println(a + b);
		}
	}
}