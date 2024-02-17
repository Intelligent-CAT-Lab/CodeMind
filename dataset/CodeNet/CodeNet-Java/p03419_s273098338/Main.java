import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int m = stdIn.nextInt();

		if(n==1 && m==1) {
			System.out.println(1);
		}else if(n == 1 && m != 1) {
			System.out.println(m-2);
		}else if(m == 1 && n != 1){
			System.out.println(n-2);
		}else {
			System.out.println((long)(m-2)*(n-2));
		}



	}

}
