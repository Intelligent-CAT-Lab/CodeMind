import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long m = sc.nextLong();
		long rd = sc.nextLong();
		long rr = sc.nextLong();
		long cd = sc.nextLong();
		long cr = sc.nextLong();
		
		long d = (cd*100)/rd;
		while((d*rd)/100!=cd) d++;
		long r = (cr*100)/rr;
		while((r*rr)/100!=cr) r++;
		if(m-d-r<0) System.out.println(-1);
		else System.out.println(m-d-r);
	}

}