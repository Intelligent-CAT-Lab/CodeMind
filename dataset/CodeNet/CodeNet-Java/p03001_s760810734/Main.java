import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long W  = keyboard.nextInt();
		long H  = keyboard.nextInt();
		long x  = keyboard.nextInt();
		long y  = keyboard.nextInt();
		
		double men = (W*H)/2.0;
		double a = x*H;
		double b = (W*H)-a;
		double c = y*W;
		double d = (W*H)-c;
		
		double xx = Math.min(a, b);
		double yy = Math.min(c, d);
		
		int hou = 0;
		
		if(xx == men) {
			hou ++;
		}
		if(yy == men) {
			hou ++;
		}
		
		if(hou <= 1) {
			hou = 0;
		}else {
			hou = 1;
		}

		System.out.print(men + " " + hou);
		keyboard.close();	
	}
}
