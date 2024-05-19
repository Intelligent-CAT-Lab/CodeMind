System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n, k = map(int, input().split())
ans=0
for i in range(k,n+2):
    ans+=(((2*n-i+1)*i)//2)-(i*(i-1)//2)+1
print(ans%(10**9+7))
```


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        for (int i = k; i <= n + 1; i++) {
            ans += ((((2 * n - i + 1) * i) / 2) - ((i * (i - 1)) / 2) + 1) % (100000007);
        }
        System.out.println(ans);
    }
}
```

In this Java code, we first import the `Scanner` class from the `java.util` package to read input from the user. We then declare and initialize the variables `n` and `k` using the `nextInt()` method of the `Scanner` object.

Next, we declare a `long` variable `ans` to store the final answer. We use a `for` loop to iterate over the range of `k` to `n + 1`. Inside the loop, we calculate the value of `ans` using the given formula and add it to the `ans` variable.

Finally, we print the value of `ans` modulo `100000007` to ensure that the answer fits within the constraints of the problem.<|endoftext|>
