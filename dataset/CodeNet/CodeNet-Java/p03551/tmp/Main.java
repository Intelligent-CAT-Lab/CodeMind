import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
System.out.println("[INST]13;n;sc.nextInt();"+n);
		int m = sc.nextInt();
System.out.println("[INST]14;m;sc.nextInt();"+m);
		
		
		long base = n*100+m*1800;
		
		System.out.println(base << m);
		
	}
}
