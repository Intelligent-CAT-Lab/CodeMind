<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
Positive


```
# B 
si = lambda: input()
ni = lambda: int(input())
nm = lambda: map(int, input().split())
nl = lambda: list(map(int, input().split()))
a,b=nm()

if a<=0<=b:
    print('Zero')
elif b<0:
    if (b-a+1)%2==1:
        print('Negative')
    elif (b-a+1)%2==0:
        print('Positive')
elif 0<a:
    print('Positive')
    

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

        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (b < 0) {
            if ((b - a + 1) % 2 == 1) {
                System.out.println("Negative");
            } else if ((b - a + 1) % 2 == 0) {
                System.out.println("Positive");
            }
        } else if (0 < a) {
            System.out.println("Positive");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and then checks if the first number is less than or equal to zero and the second number is greater than or equal to zero. If so, it prints "Zero". If not, it checks if the second number is less than zero. If so, it checks if the difference between the second and first number plus one is odd. If so, it prints "Negative". If not, it prints "Positive". If the first number is greater than zero, it prints "Positive".
<|EOT|>
