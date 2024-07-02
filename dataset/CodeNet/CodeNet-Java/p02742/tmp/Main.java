import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
System.out.println("[INST]7;w;scan.nextLong();"+w);
		long h = scan.nextLong();
System.out.println("[INST]8;h;scan.nextLong();"+h);

		if(w == 1 || h == 1) {
			System.out.println(1);
			return;
		}
		long c = (w*h)%2 == 0 ? (w*h)/2 : (w*h)/2+1;
		System.out.println(c);
	}

}