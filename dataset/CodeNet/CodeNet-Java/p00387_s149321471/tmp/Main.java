import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int dress = sc.nextInt();
System.out.println("[INST]5;dress;sc.nextInt();"+dress);
		int days = sc.nextInt();
System.out.println("[INST]6;days;sc.nextInt();"+days);
		System.out.println((days + dress - 1) / dress);
	}
}

