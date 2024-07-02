import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a,b;
		int d,r;
		double f;

		a = sc.nextInt();
System.out.println("[INST]10;a;sc.nextInt();"+a);
		b = sc.nextInt();
System.out.println("[INST]11;b;sc.nextInt();"+b);

		d = a/b;
		r =a%b;
		f = (double)a/(double)b;

		System.out.print(d+" "+r+" ");
		System.out.println(String.format("%.5f", f));


		sc.close();
	}

}
