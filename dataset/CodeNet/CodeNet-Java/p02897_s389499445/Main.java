import java.util.*;

class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		int N = sc.nextInt();
		System.out.println((double)((N+1)/2)/N);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}