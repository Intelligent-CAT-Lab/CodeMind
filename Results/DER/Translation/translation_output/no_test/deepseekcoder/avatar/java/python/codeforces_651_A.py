<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def codeforces_651_A():
    num1, num2 = map(int, sys.stdin.readline().split())
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

codeforces_651_A()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then it enters a loop where it increments or decrements the two integers based on their values and increments a counter until one of the integers becomes 1. The counter is then printed out.
<|EOT|>
