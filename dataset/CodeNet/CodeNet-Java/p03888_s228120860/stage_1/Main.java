import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner d = new Scanner(System.in);
		int a = d.nextInt();
		int b = d.nextInt();
		double c;
		c=(a*b*1.0/(a+b));
		System.out.println(c);
	}
}