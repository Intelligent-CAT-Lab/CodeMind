import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		int count = 0;
var newVariable_0 = in.length();		for(int i = 0; i < newVariable_0; i++) {
			String a = in.substring(0,i);
			String b = in.substring(i);
var newVariable_1 = a.length();var newVariable_2 = a.charAt(0);			if(a.length() >= 2 && newVariable_2 == '0') continue;
var newVariable_3 = b.length();var newVariable_4 = b.charAt(0);			if(b.length() >= 2 && newVariable_4 == '0') continue;
var newVariable_5 = b.length();			if(newVariable_5 == 0) b = "0";
var newVariable_6 = a.length();			if(newVariable_6 == 0) a = "0";
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