<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p00411{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double t = scan.nextInt();
        double r = scan.nextInt();
        System.out.println(r * t / a);
        scan.close();
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

a, t, r = map(float, sys.stdin.readline().split())
print(r * t / a)
```
This code uses the `map` function to convert the input strings to floating-point numbers, and then it performs the calculation and prints the result. The `sys.stdin.readline()` method is used to read a line of input from the standard input stream, and the `split()` method is used to split the line into a list of strings. The `map` function is then used to convert each string to a floating-point number. Finally, the calculation is performed and the result is printed to the standard output stream.</s>
