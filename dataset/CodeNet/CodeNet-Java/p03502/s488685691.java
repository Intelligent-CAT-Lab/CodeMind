import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	int N = sc.nextInt();

	int X = N;

	int fx = 0;


	while(N>=10) {

		fx += N%10;

		N /= 10;

	}

	fx += N;

	if(X%fx == 0) System.out.println("Yes");

	else System.out.println("No");
}

}