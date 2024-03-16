<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
class p03359{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt(); 
        if(b>=a){
            System.out.println(a);
        }else{
            System.out.println(a-1);
        }
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

if b >= a:
    print(a)
else:
    print(a - 1)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from the user to integers, and the `split` method is used to split the input into two separate integers. The rest of the code is similar to the Java code, with the only difference being the use of `print` instead of `System.out.println`.</s>
