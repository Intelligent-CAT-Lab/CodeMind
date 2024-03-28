<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N=input()

memo={}
memo[0]=1
memo[1]=2

def func(N):
	if N in memo:
		return memo[N]
	result= ( func(N/2)+func((N-1)/2)+func(N/2-1) )% (10**9+7)
	
	memo[N]=result
	return result

print func(N)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] memo=new int[N+1];
        memo[0]=1;
        memo[1]=2;
        for(int i=2;i<=N;i++){
            memo[i]=(memo[i/2]+memo[(i-1)/2]+memo[i/2-1])%1000000007;
        }
        System.out.println(memo[N]);
    }
}
```
<|endoftext|>
