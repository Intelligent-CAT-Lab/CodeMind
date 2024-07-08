import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[1001];
		long sum=1;
		for(int i=2;i<=n;i++){
			int t = i;
			for(int j=2;j<=i;j++){
				while(t%j==0){
					x[j]++;
					t/=j;
				}
			}
		}
		long e=(int)1e9+7;
		for(int i=0;i<1001;i++){
			if(x[i]>0){
				sum*=(x[i]+1);
				sum%=e;
			}	
		}
		System.out.print(sum);
	}
}