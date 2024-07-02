import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, m;

	void run(){
		n=sc.nextInt();
System.out.println("[INST]17;n;sc.nextInt();"+n);
		m=sc.nextInt();
System.out.println("[INST]18;m;sc.nextInt();"+m);
		solve();
	}

	void solve(){
		double[] dp=new double[n+1];
		dp[0]=1;
		for(int j=1; j<=n; j++){
			for(int i=1; i<=min(m, j); i++){
System.out.println("[INST]26;None;min(m, j);"+min(m, j));
				dp[j]+=dp[j-i]/j;
			}
		}
		println(String.format("%.12f", dp[n]));
System.out.println("[INST]30;None;String.format('%.12f', dp[n]);"+String.format("%.12f", dp[n]));
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}