System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    static int N;
    static long MOD = 100000007;
    static HashMap<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        memo.put(0, 1L);
        memo.put(1, 2L);
        System.out.println(func(N));
    }

    public static long func(int N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        long result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % MOD;
        memo.put(N, result);
        return result;
    }
}
```

You can run this code with the following test case:

```java
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testFunc() {
        assertEquals(-38, Main.func(3));
    }
}
```<|endoftext|>
