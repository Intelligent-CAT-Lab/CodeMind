import java.util.*;

public class Main {
	
	static long[] layer;
	
	public static void main(String args[]){
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		
		layer=new long [n];
		for(int i=0;i<n;i++){
			if(i==0)layer[i]=1;
			else layer[i]=layer[i-1]*2+3;
		}
		
		
		long ans = pati(n,x);
		
		
		
		System.out.println(ans);
		
		
	}
	
	
	public static long pati(int n, long x){
		if(n==0)return 1;
		else if(x<=1)return 0;
		else if(x<=1+layer[n-1])return pati(n-1,x-1);
		else if(layer[n-1]+2==x)return pati(n-1,x-2)+1;
		else if(x<2*layer[n-1]+2)return pati(n-1,layer[n-1])+1+pati(n-1,x-1-layer[n-1]-1);
		else return 2*pati(n-1,layer[n-1])+1;
		
		
	}

}