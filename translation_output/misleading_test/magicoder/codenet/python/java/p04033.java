<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
z*`A<iex

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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else if (b < 0) {
            if ((b - a + 1) % 2 == 1) {
                System.out.println("Negative");
            } else if ((b - a + 1) % 2 == 0) {
                System.out.println("Positive");
            }
        } else if (a > 0) {
            System.out.println("Positive");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, and then checks if the range between the two integers (inclusive) contains zero, and if so, prints "Zero". If the range does not contain zero, it checks if the range contains negative numbers, and if so, it checks if the count of negative numbers in the range is odd or even, and prints "Negative" or "Positive" accordingly. If the range does not contain negative numbers, it prints "Positive".<｜end▁of▁sentence｜>
