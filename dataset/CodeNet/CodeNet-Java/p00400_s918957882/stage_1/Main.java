import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int c,code;

		Scanner sc = new Scanner(System.in);

		c=sc.nextInt();

		if(c>=65 && c<=90)
			code=1;
		else if(c>=97 && c<=122)
			code=2;
		else
			code=0;
		System.out.println(code);

	}
}

