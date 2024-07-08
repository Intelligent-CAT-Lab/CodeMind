import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		boolean found=false;
		for (long h = 1;h<=3500;h++) {
			for (long w = 1; w <= 3500; w++) {
				long Num = N*h*w;
				long Den = 4*h*w-N*w-N*h; //n=Nhw/(4hw-Nw-Nh) -> Analysis in programming handbook
				if (Den>0&&Num%Den==0) {
					long ans = Num/Den;
					System.out.println(h+" "+ans+" "+w);
					found=true;
					break;
				}
			}
			if (found) break;
		}
	}	
}