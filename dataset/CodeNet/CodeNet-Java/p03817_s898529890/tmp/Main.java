import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
System.out.println("[INST]5;x;scan.nextLong();"+x);
		long rest = x%11L;
		long result = (x-rest)/11L;
		result*=2L;
		if(rest>0) result++;
		if(rest>6) result++;
		System.out.println(result);
	}
}
