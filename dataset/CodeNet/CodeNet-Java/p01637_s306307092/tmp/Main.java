import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long m = sc.nextLong();
System.out.println("[INST]7;m;sc.nextLong();"+m);
		long rd = sc.nextLong();
System.out.println("[INST]8;rd;sc.nextLong();"+rd);
		long rr = sc.nextLong();
System.out.println("[INST]9;rr;sc.nextLong();"+rr);
		long cd = sc.nextLong();
System.out.println("[INST]10;cd;sc.nextLong();"+cd);
		long cr = sc.nextLong();
System.out.println("[INST]11;cr;sc.nextLong();"+cr);
		
		long d = (cd*100)/rd;
		while((d*rd)/100!=cd) d++;
		long r = (cr*100)/rr;
		while((r*rr)/100!=cr) r++;
		if(m-d-r<0) System.out.println(-1);
		else System.out.println(m-d-r);
	}

}