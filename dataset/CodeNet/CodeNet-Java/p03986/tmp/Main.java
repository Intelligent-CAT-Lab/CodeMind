import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
System.out.println("[INST]6;x;sc.next();"+x);
		int c =0;
		int len =0;
		for(int i=0;i<x.length();i++) {
System.out.println("[INST]9;None;x.length();"+x.length());
			if(x.charAt(i)=='T') {
System.out.println("[INST]10;None;x.charAt(i);"+x.charAt(i));
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
System.out.println("[INST]23;len;Math.abs(c);"+len);
		System.out.println(len);
	}
	
}
