<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
-21

```
# AOJ 1591 Graph Making
# Python3 2018.7.13 bal4u

n, d = map(int, input().split())
if d == 1: print(n*(n-1)//2)
else: print((n-1)+(n-d-1)*n-((n-d-1)*(n+d-2)//2))

```
[/INST]
```java
import java.util.Scanner;

public class GraphMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        if (d == 1) {
            System.out.println(n * (n - 1) / 2);
        } else {
            System.out.println((n - 1) + (n - d - 1) * n - ((n - d - 1) * (n + d - 2) / 2));
        }
    }
}
```
This is a Java implementation of the Python code provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print the output. The logic is the same as the Python code, with the only difference being the syntax and the use of the `Scanner` class to read input.</s>
