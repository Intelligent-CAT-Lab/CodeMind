import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int c =0;
		int len =0;
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)=='T') {
				c--;
			}
			else {
				if(c<0) {
					len-=c;
					c=1;
				}
				else {
					c++;
				}
			}
		}
		len+=Math.abs(c);
		System.out.println(len);
	}
	
}
