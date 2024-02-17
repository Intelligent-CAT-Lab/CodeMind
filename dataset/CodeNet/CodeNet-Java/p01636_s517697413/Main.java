import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		int count = 0;
		for(int i = 0; i < in.length(); i++) {
			String a = in.substring(0,i);
			String b = in.substring(i);
			if(a.length() >= 2 && a.charAt(0) == '0') continue;
			if(b.length() >= 2 && b.charAt(0) == '0') continue;
			if(b.length() == 0) b = "0";
			if(a.length() == 0) a = "0";
			int A = Integer.parseInt(a); // A - B
			int B = Integer.parseInt(b); // A + B
			int tmp = A + B;
			if(tmp % 2 != 0) continue;
			if(tmp < 0) continue;
			tmp /= 2;
			int tmpA = B - tmp; 
			if(tmpA < 0) continue;
			count++;
		}
		System.out.println(count);
	}
 }