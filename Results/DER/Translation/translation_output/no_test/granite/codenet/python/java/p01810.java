System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n,k=map(int,input().split())
a=0
for _ in range(n-1):a+=a//(k-1)+1
print(a)
```


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a = 0;
        for (int i = 0; i < n - 1; i++) {
            a += a / (k - 1) + 1;
        }
        System.out.println(a);
    }
}
```

In this Java code, we first import the `Scanner` class from the `java.util` package to read input from the user. We then declare and initialize the variables `n` and `k` using the `nextInt()` method of the `Scanner` object.

Next, we declare and initialize the variable `a` to 0. We then use a `for` loop to iterate `n-1` times. Inside the loop, we update the value of `a` by adding `a // (k - 1) + 1` to it.

Finally, we print the value of `a` using the `println()` method of the `System.out` object.<|endoftext|>
