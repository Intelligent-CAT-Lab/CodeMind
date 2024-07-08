import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt(), B = scn.nextInt(), C = scn.nextInt(), D = scn.nextInt(), E = scn.nextInt(), F = scn.nextInt();

		double ans  = -1;
		int water = 0, sugar = 0;
		
		
		for(int a = 0;a <= F/(A*100);a++) {
			for(int b = 0;b <= (F-100 * A * a)/(100 * B);b++) {
				for(int c = 0;c <= (F - 100 * A * a - 100 * B * b)/(C);c++) {
					for(int d = 0;d <= (F - 100 * A * a - 100 * B * b - C * c)/D;d++) {
						if(C*c+D*d > (A*a+B*b)*E || a+b==0)continue;
						double buf = (double)(C*c+D*d)/(double)(100 * (A*a+B*b) + C*c+D*d);
						if(buf > ans) {
							ans = buf;
							water = (A*a+B*b)*100;
							sugar = C*c+D*d;
						}
					}
				}
			}
		}

		System.out.println(water+sugar + " " + sugar);

	}

}
