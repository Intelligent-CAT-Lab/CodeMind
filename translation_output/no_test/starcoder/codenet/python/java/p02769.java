<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
def i1():
 return int(input())
def i2():
 return [int(i) for i in input().split()]
mod=10**9+7
def bp(a,n):
        r=1
        while(n):
           if n%2:
              r=r*a%mod
           a=a*a%mod
           n>>=1
        return r
[n,k]=i2()
if n<=k:
   x=1
   for i in range(n-1):
      x*=2*n-1-i
      x%=mod
   y=1
   for i in range(n-1):
      y*=i+1
      y%=mod
   print((x*bp(y,10**9+5))%mod)   
   
else:
   x=1
   y=1
   t=1
   for i in range(k):
      t*=i+1
      t%=mod
      y*=n-1-i
      y%=mod
      y*=n-i
      y%=mod
      c=bp(t,10**9+5)
      x+=y*c*c
      x%=mod
   print(x)   
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;
public class Main{
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
```
<|endoftext|>
