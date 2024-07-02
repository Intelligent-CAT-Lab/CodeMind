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
System.out.println("[INST]15;s;sc.nextLine();"+s);
		solve();
	}

	void solve(){
		HashSet<Long> set=new HashSet<Long>();
		for(int i=0; i<s.length(); i++){
System.out.println("[INST]21;None;s.length();"+s.length());
			int sub=i==0?0:Integer.parseInt(s.substring(0, i));
System.out.println("[INST]22;None;Integer.parseInt(s.substring(0, i));"+Integer.parseInt(s.substring(0, i)));
System.out.println("[INST]22;None;s.substring(0, i);"+s.substring(0, i));
			int add=Integer.parseInt(s.substring(i, s.length()));
System.out.println("[INST]23;add;Integer.parseInt(s.substring(i, s.length()));"+add);
System.out.println("[INST]23;None;s.substring(i, s.length());"+s.substring(i, s.length()));
System.out.println("[INST]23;None;s.length();"+s.length());
			int a=(sub+add)/2, b=(-sub+add)/2;
			if(a>=0&&b>=0
					&&Integer.parseInt((a-b)+""+(a+b))==Integer.parseInt(s)){
System.out.println("[INST]26;None;Integer.parseInt((a-b)+''+(a+b));"+Integer.parseInt((a-b)+""+(a+b)));
System.out.println("[INST]26;None;Integer.parseInt(s);"+Integer.parseInt(s));
				set.add(a*(1L<<64)+b);
System.out.println("[INST]27;None;set.add(a*(1L<<64)+b);"+set.add(a*(1L<<64)+b));
			}
		}
		println(set.size()+"");
System.out.println("[INST]30;None;set.size();"+set.size());
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}