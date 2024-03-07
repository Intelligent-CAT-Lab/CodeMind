<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p03477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt() + sc.nextInt();
        int right = sc.nextInt() + sc.nextInt();
        if(left > right) {
            System.out.print("Left");
        } else if (left == right) {
            System.out.print("Balanced");
        } else {
            System.out.print("Right");
        }
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

left = int(sys.stdin.readline()) + int(sys.stdin.readline())
right = int(sys.stdin.readline()) + int(sys.stdin.readline())

if left > right:
    print("Left")
elif left == right:
    print("Balanced")
else:
    print("Right")
```
Note: The `sys` module is used to read input from the standard input stream, and the `int` function is used to convert the input strings to integers. The `readline` method is used to read a line of input from the standard input stream, and the `+` operator is used to add the two integers. The `print` function is used to print the output.</s>
