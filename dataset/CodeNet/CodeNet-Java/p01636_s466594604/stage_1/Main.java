import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Mysterious Operator
public class Main{
	Scanner sc=new Scanner(System.in);

	String s;

	void run(){
		s=sc.nextLine();
		solve();
	}

	void solve(){
		HashSet<Long> set=new HashSet<Long>();
var newVariable_0 = s.length();		for(int i=0; i<newVariable_0; i++){
var newVariable_1 = Integer.parseInt(s.substring(0, i));var newVariable_2 = s.substring(0, i);			int sub=i==0?0:Integer.parseInt(newVariable_2);
var newVariable_3 = s.substring(i, s.length());var newVariable_4 = s.length();			int add=Integer.parseInt(s.substring(i, newVariable_4));
			int a=(sub+add)/2, b=(-sub+add)/2;
			if(a>=0&&b>=0
var newVariable_5 = Integer.parseInt((a-b)+""+(a+b));var newVariable_6 = Integer.parseInt(s);					&&Integer.parseInt((a-b)+""+(a+b))==newVariable_6){
var newVariable_7 = set.add(a*(1L<<64)+b);			}
		}
var newVariable_8 = set.size();		println(newVariable_8+"");
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}