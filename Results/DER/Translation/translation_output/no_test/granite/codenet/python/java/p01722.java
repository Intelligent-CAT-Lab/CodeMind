System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n=int(input())
print(1if n==0else 2//n)
```


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        if (n == 0) {
            result = 1;
        } else {
            result = 2 / n;
        }
        System.out.println(result);
    }
}
```

In this Java code, we first import the `Scanner` class from the `java.util` package to read user input. We then create a `Scanner` object to read an integer input from the user.

Next, we declare an integer variable `result` to store the result of the expression. We use an `if-else` statement to check if `n` is equal to 0. If it is, we assign the value 1 to `result`. Otherwise, we assign the result of the expression `2 / n` to `result`.

Finally, we print the value of `result` to the console using the `System.out.println()` method.<|endoftext|>
