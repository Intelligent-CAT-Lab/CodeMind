import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long W  = keyboard.nextInt();
System.out.println("[INST]8;W;keyboard.nextInt();"+W);
		long H  = keyboard.nextInt();
System.out.println("[INST]9;H;keyboard.nextInt();"+H);
		long x  = keyboard.nextInt();
System.out.println("[INST]10;x;keyboard.nextInt();"+x);
		long y  = keyboard.nextInt();
System.out.println("[INST]11;y;keyboard.nextInt();"+y);
		
		double men = (W*H)/2.0;
		double a = x*H;
		double b = (W*H)-a;
		double c = y*W;
		double d = (W*H)-c;
		
		double xx = Math.min(a, b);
System.out.println("[INST]19;xx;Math.min(a, b);"+xx);
		double yy = Math.min(c, d);
System.out.println("[INST]20;yy;Math.min(c, d);"+yy);
		
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
