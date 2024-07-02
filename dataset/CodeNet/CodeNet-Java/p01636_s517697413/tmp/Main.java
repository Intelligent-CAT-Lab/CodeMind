import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
System.out.println("[INST]10;in;sc.next();"+in);
		int count = 0;
		for(int i = 0; i < in.length(); i++) {
System.out.println("[INST]12;None;in.length();"+in.length());
			String a = in.substring(0,i);
System.out.println("[INST]13;a;in.substring(0,i);"+a);
			String b = in.substring(i);
System.out.println("[INST]14;b;in.substring(i);"+b);
			if(a.length() >= 2 && a.charAt(0) == '0') continue;
System.out.println("[INST]15;None;a.length();"+a.length());
System.out.println("[INST]15;None;a.charAt(0);"+a.charAt(0));
			if(b.length() >= 2 && b.charAt(0) == '0') continue;
System.out.println("[INST]16;None;b.length();"+b.length());
System.out.println("[INST]16;None;b.charAt(0);"+b.charAt(0));
			if(b.length() == 0) b = "0";
System.out.println("[INST]17;None;b.length();"+b.length());
			if(a.length() == 0) a = "0";
System.out.println("[INST]18;None;a.length();"+a.length());
			int A = Integer.parseInt(a); // A - B
System.out.println("[INST]19;A;Integer.parseInt(a);"+A);
			int B = Integer.parseInt(b); // A + B
System.out.println("[INST]20;B;Integer.parseInt(b);"+B);
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