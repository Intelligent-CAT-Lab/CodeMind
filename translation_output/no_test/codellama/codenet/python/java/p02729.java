<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,m = map(int,input().split())

even = n * (n-1) // 2
odd = m * (m-1) // 2

print(even + odd)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int even = n * (n - 1) / 2;
        int odd = m * (m - 1) / 2;
        System.out.println(even + odd);
    }
}
```
Note that the `map` function in Python is not necessary in Java, as the `Scanner` class provides a method to read input as integers directly. Also, the `/` operator in Python is equivalent to the `div` method in Java, which returns the integer part of the result.</s>
