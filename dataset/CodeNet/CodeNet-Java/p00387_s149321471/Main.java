import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int dress = sc.nextInt();
		int days = sc.nextInt();
		System.out.println((days + dress - 1) / dress);
	}
}

