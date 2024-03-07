<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p02951 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          if(b + c < a){
              System.out.println(0);
          } else {
            System.out.println(b + c - a);
          }
        }
    }

Translate the above java code to python.

python code:

[/INST]
```python
import sys

a, b, c = map(int, sys.stdin.readline().split())

if b + c < a:
    print(0)
else:
    print(b + c - a)
```
This code reads the input from the standard input stream, which is the console, and splits it into three integers using the `split()` method. It then checks if the sum of the two integers is less than the first integer, and if it is, it prints 0, otherwise it prints the difference between the sum of the two integers and the first integer.</s>
