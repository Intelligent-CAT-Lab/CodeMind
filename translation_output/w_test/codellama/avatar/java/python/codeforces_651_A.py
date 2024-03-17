<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

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
```</s>
