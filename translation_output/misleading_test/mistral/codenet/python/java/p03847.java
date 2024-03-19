<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-38

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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 1);
        memo.put(1, 2);

        int result = func(N);
        System.out.println(result);
    }

    public static int func(int N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        int result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % (1000000007);
        memo.put(N, result);
        return result;
    }
}
```</s>
