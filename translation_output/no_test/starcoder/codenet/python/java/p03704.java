<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
def f(d,x,y):n=int("9"*x+"0"*y);return d==0 if x<1 else sum(f(d+i*n,x-2,y+1)*(10-abs(i)-(y<1))for i in range(-9,10)if abs(d+i*n)<n)
D=input();print sum(f(D,i,0)*(10-i%2*9)for i in range(1,21))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt();
		int[] dp=new int[21];
		dp[0]=1;
		for(int i=1;i<21;i++){
			int[] dp2=new int[21];
			for(int j=0;j<21;j++){
				for(int k=0;k<10;k++){
					int n=9*i+k;
					if(j+k<10)dp2[j+k]+=dp[j]*(10-Math.abs(k)-(j<1));
					if(Math.abs(j+k)<n)dp2[n-Math.abs(j+k)]+=dp[j]*(10-Math.abs(k)-(j<1));
				}
			}
			dp=dp2;
		}
		int sum=0;
		for(int i=0;i<21;i++)sum+=dp[i]*(10-i%2*9);
		System.out.println(sum);
	}
}
```
<|endoftext|>
