import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// MLE
public class Main{
	Scanner sc=new Scanner(System.in);

	int n, k;
	long x0;

	void run(){
		n=sc.nextInt();
System.out.println("[INST]16;n;sc.nextInt();"+n);
		k=sc.nextInt()-1;
System.out.println("[INST]17;None;sc.nextInt();"+sc.nextInt());
		x0=sc.nextLong();
System.out.println("[INST]18;x0;sc.nextLong();"+x0);
		solve();
	}

	void solve(){
		if(x0==0){
			println("0");
			return;
		}

		long x=x0;
		int s=(int)1e4;
		int[] count=new int[s];
		double offset=pow(2, 63), M=s/pow(2, 64);
System.out.println("[INST]31;offset;pow(2, 63);"+offset);
System.out.println("[INST]31;None;pow(2, 64);"+pow(2, 64));
		for(int i=0; i<n; i++){
			int at=(int)((x+offset)*M);
			if(at<0){
				at=0;
			}
			if(at>=s){
				at=s-1;
			}
			count[at]++;
			x^=x<<13;
			x^=x>>>7;
			x^=x<<17;
		}

		int sum=0, length=-1, target=-1;
		for(int i=0; i<s; i++){
			if(sum<=k&&k<sum+count[i]){
				target=i;
				length=count[i];
				break;
			}
			sum+=count[i];
		}

		int now=0;
		long[] is=new long[length];
		x=x0;
		for(int i=0; i<n; i++){
			int at=(int)((x+offset)*M);
			if(at<0){
				at=0;
			}
			if(at>=s){
				at=s-1;
			}
			if(at==target){
				is[now++]=x;
			}
			x^=x<<13;
			x^=x>>>7;
			x^=x<<17;
		}
		sort(is);
System.out.println("[INST]74;None;sort(is);"+sort(is));
		println(is[k-sum]+"");
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}