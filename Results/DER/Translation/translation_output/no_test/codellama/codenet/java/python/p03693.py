<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p03693 {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt()*100;
        int g=scan.nextInt()*10;
        int b=scan.nextInt();
 
        int sum=r+g+b;
        System.out.println(sum%4==0?"YES":"NO");
 
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

r, g, b = map(int, sys.stdin.readline().split())

sum = r * 100 + g * 10 + b

if sum % 4 == 0:
    print("YES")
else:
    print("NO")
```
Note: The `map` function is used to convert the input strings to integers. The `split` function is used to split the input string into three parts, and the `int` function is used to convert each part to an integer. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream.</s>
