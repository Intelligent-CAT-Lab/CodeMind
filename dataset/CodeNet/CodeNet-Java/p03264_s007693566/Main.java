import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if(k%2==0) {
			System.out.println((k/2)*(k/2));
		}else {
			System.out.println((k/2+1)*(k/2));
		}
		sc.close();
	}
}
