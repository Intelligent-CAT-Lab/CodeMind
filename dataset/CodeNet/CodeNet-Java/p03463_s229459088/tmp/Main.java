import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
System.out.println("[INST]5;n;scn.nextInt();"+n);
		int a = scn.nextInt();
System.out.println("[INST]6;a;scn.nextInt();"+a);
      	int b = scn.nextInt();
System.out.println("[INST]7;b;scn.nextInt();"+b);
      	if((b-a)%2==0) System.out.println("Alice");
      	else System.out.println("Borys");
	}
}
