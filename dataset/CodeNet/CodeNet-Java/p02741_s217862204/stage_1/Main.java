import java.util.Scanner;

public class Main {
	public static void main(String [] args)
	{
		int [] a= {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
		Scanner cin = new Scanner(System.in);
		int k=cin.nextInt();
		System.out.println(a[k-1]);
		cin.close();
	}
}