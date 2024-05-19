System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n,m=map(int,input().split())
d=[1]*(n+1)
for i in range(n):
  d[i+1]=((m-i)*((m-n+i)*d[i]+i*d[i-1]*(m-i+1)))%(10**9+7)
print(d[-1])

```


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] d = new long[n+1];
        Arrays.fill(d, 1);
        for (int i = 0; i < n; i++) {
            d[i+1] = ((m-i)*((m-n+i)*d[i]+i*d[i-1]*(m-i+1)))%(100000007);
        }
        System.out.println(d[n]);
    }
}
```

In this Java code, we first import the `Scanner` class from the `java.util` package to read input from the user. We then declare and initialize the variables `n` and `m` using the `nextInt()` method of the `Scanner` object.

Next, we declare and initialize an array `d` of size `n+1` with all elements set to 1. We use the `Arrays.fill()` method to do this.

We then use a `for` loop to iterate over the range from 0 to `n-1`. In each iteration, we calculate the value of `d[i+1]` using the given formula and store it in the array. We also take care to handle the modulo operation by using the `%` operator with the value `100000007`.

Finally, we print the value of `d[n]`, which represents the final result of the calculation.<|endoftext|>
