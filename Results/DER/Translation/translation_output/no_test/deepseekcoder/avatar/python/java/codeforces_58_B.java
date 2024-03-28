<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a = int ( input ( ) )
for i in range ( a , 0 , - 1 ) :
    if a % i == 0 :
        print ( i , end = ' â ' )
        a = i


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i);
                if(i != 1) {
                    System.out.print(" ");
                }
                a = i;
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It takes an integer input from the user, then it iterates from the input number down to 1. If the input number is divisible by the current number (i), it prints the current number. The input number is then updated to the current number. The numbers are printed with a space between them.
<|EOT|>
