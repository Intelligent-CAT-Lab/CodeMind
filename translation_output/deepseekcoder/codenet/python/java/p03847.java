<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        memo.put(0, 1);
        memo.put(1, 2);

        System.out.println(func(N));
    }

    private static int func(int N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        int result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % ((int) Math.pow(10, 9) + 7);

        memo.put(N, result);
        return result;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, initializes a memoization map, and then prints the result of calling the `func` method with the input integer. The `func` method uses memoization to avoid redundant calculations.
<|EOT|>
