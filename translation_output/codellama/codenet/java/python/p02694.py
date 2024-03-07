<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

class p02694 {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long x=stdIn.nextLong();
        int count=0;

        long a=100;
        while(true){
            if(a>=x){
                break;
            }
            a=a+a/100;
            count++;
        }
        System.out.println(count);
        
    }

}

Translate the above java code to python.

python code:

[/INST]
```
import sys

x = int(sys.stdin.readline())
count = 0

a = 100
while True:
    if a >= x:
        break
    a = a + a // 100
    count += 1

print(count)
```
This is the equivalent Python code for the given Java code. The `Scanner` class in Java is replaced by the `sys.stdin.readline()` function in Python, which reads a line of input from the standard input stream. The `nextLong()` method in Java is replaced by the `int()` function in Python, which converts the input string to an integer. The `while` loop in Java is replaced by the `while True` loop in Python, which continues to loop until the condition is met. The `break` statement in Java is replaced by the `break` statement in Python, which exits the loop. The `println()` method in Java is replaced by the `print()` function in Python, which prints the output to the standard output stream.</s>
