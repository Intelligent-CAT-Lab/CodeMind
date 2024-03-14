import java.util.*;
import java.math.*;
public class p02769 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		if(n<=k){
			long x=1;
			for(int i=0;i<n-1;i++){
				x=x*(2*n-1-i);
				x%=1000000007;
			}
			long y=1;
			for(int i=0;i<n-1;i++){
				y=y*(i+1);
				y%=1000000007;
			}
			System.out.println((x*pow(y,1000000005))%1000000007);
		}
		else{
			long x=1;
			long y=1;
			long t=1;
			for(int i=0;i<k;i++){
				t=t*(i+1);
				t%=1000000007;
				y=y*(n-1-i);
				y%=1000000007;
				y=y*(n-i);
				y%=1000000007;
				long c=pow(t,1000000005);
				x+=y*c*c;
				x%=1000000007;
			}
			System.out.println(x);
		}
	}
	public static long pow(long a,long b){
		long ans=1;
		while(b>0){
			if((b&1)==1)
				ans=ans*a;
			a=a*a;
			b>>=1;
		}
		return ans;
	}
}