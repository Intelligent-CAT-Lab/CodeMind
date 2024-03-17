<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9 8 1000 999

Expected output:
Alice


```
t1,t2,r1,r2 = map(int,input().split())
if r1 == -1 or r2 == -1:
    if t1 < t2:
        print('Alice')
    elif t1 > t2:
        print('Bob')
    else:
        print('Draw')
elif r1 > r2:
    print('Alice')
elif r1 < r2:
    print('Bob')
else:
    print('Draw')

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();

        if (r1 == -1 || r2 == -1) {
            if (t1 < t2) {
                System.out.println("Alice");
            } else if (t1 > t2) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        } else if (r1 > r2) {
            System.out.println("Alice");
        } else if (r1 < r2) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, and then checks the conditions to determine who wins. The result is then printed to the console.
<|EOT|>
