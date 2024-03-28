<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 5

Expected output:
Y>s

```
a,b,c=map(int,input().split())
if a<c<b or a>c>b:
  print('Yes')
else:
  print('No')
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < c && c < b || a > c && c > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads three integers from the standard input, checks if the third integer is between the first and second integers (exclusive), and prints "Yes" if it is, "No" otherwise.
<|EOT|>
