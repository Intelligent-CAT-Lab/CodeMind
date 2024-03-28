<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3


```
# AOJ 1591 Graph Making
# Python3 2018.7.13 bal4u

n, d = map(int, input().split())
if d == 1: print(n*(n-1)//2)
else: print((n-1)+(n-d-1)*n-((n-d-1)*(n+d-2)//2))

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        if (d == 1) {
            System.out.println(n*(n-1)/2);
        } else {
            System.out.println((n-1)+(n-d-1)*n-((n-d-1)*(n+d-2)/2));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and if the second integer is 1, it prints the number of edges in a complete graph with `n` nodes. If the second integer is not 1, it prints the number of edges in a complete graph with `n` nodes and `d` distance between any two nodes.
<|EOT|>
