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
		for(int i=0; i<s.length(); i++){
			int sub=i==0?0:Integer.parseInt(s.substring(0, i));
			int add=Integer.parseInt(s.substring(i, s.length()));
			int a=(sub+add)/2, b=(-sub+add)/2;
			if(a>=0&&b>=0
					&&Integer.parseInt((a-b)+""+(a+b))==Integer.parseInt(s)){
				set.add(a*(1L<<64)+b);
			}
		}
		println(set.size()+"");
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}