
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		long X=sc.nextLong();

		long h =100L;
		int count = 0;
		sc.close();

		while(h < X) {
			h *= 1.01;
			count++;
		}

		System.out.println(count);




	}
}
