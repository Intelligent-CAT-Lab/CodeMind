<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p03481 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long X = sc.nextLong();
        Long Y = sc.nextLong();

        int i=0;
        while(X<=Y){
            i++;
            X*=2;
        }

        System.out.println(i);
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

X, Y = map(int, sys.stdin.readline().split())

i = 0
while X <= Y:
    i += 1
    X *= 2

print(i)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input strings to integers, and the `split` method is used to split the input string into two integers. The rest of the code is similar to the Java code, with the exception of the `print` function, which is used to print the result instead of `System.out.println`.</s>
