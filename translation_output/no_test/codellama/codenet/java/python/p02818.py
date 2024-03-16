<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.*;
import java.util.*;

public class p02818{
    static public void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        long A = sc.nextLong(), B = sc.nextLong(), K = sc.nextLong();
        if(K<=A){
            A -= K;
        } else if(K <= A+B){
            B -= K-A;
            A = 0;
        } else {
            A = 0; B = 0;
        }
        System.out.println(A+" "+B);
    }
}



Translate the above java code to python.

python code:

[/INST]
```python
import sys

A, B, K = map(int, sys.stdin.readline().split())

if K <= A:
    A -= K
elif K <= A + B:
    B -= K - A
    A = 0
else:
    A = 0
    B = 0

print(A, B)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from a string to a list of integers, and the `split` method is used to split the input into a list of strings. The `readline` method is used to read a line of input from the standard input stream, and the `split` method is used to split the line into a list of strings. The `int` function is used to convert the input from a string to an integer. The `if` statement is used to check if the input is within the range of the first number, and the `elif` statement is used to check if the input is within the range of the sum of the first and second numbers. The `else` statement is used to handle the case where the input is not within the range of either number. The `print` function is used to output the result.</s>
