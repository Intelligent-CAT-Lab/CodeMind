<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 5

Expected output:
Ye

```
a,b,c = map(int,input().split())
if a == b and b != c:
  print("Yes")
elif b == c and a != b:
  print("Yes")
elif a == c and a != b:
  print("Yes")
else:
  print("No")
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b != c) {
            System.out.println("Yes");
        } else if (b == c && a != b) {
            System.out.println("Yes");
        } else if (a == c && a != b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads three integers from the standard input, and then checks if any two of them are equal and the third one is different. If such a case is found, it prints "Yes", otherwise it prints "No".
<|EOT|>
