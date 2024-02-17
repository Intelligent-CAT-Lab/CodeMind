import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		long base = n*100+m*1800;
		
		System.out.println(base << m);
		
	}
}
