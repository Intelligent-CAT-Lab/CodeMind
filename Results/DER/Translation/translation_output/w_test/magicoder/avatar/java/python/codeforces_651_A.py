<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 25

Expected output:
122


```
import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int counter = 0;
        
        while (num1 != 0 && num2 != 0) {
            if (num1 == 1 && num2 == 1) {
                break;
            }
            
            if (num1 <= num2) {
                num1++;
                num2 -= 2;
            } else {
                num1 -= 2;
                num2++;
            }
            
            counter++;
        }
        
        System.out.println(counter);
    }
}
```

@@ Response
```python
num1, num2 = map(int, input().split())
counter = 0

while num1 != 0 and num2 != 0:
    if num1 == 1 and num2 == 1:
        break

    if num1 <= num2:
        num1 += 1
        num2 -= 2
    else:
        num1 -= 2
        num2 += 1

    counter += 1

print(counter)
```

This Python code does the same thing as the Java code. It reads two integers from the input, and then enters a loop where it increments or decrements the numbers based on their values. The loop continues until either of the numbers becomes 0 or both become 1. The number of iterations is counted and printed as the output.<｜end▁of▁sentence｜>
