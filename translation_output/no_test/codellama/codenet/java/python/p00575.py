<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
class p00575{
    public static void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
        int c = sc.nextInt();
	int i = 0,cnt = 0; 
	while(cnt < c){
	    i++;
	    cnt += a;
	    if(i % 7 == 0){cnt += b;}
	    
	}
	System.out.println(i);
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b, c = map(int, sys.stdin.readline().split())

i = 0
cnt = 0
while cnt < c:
    i += 1
    cnt += a
    if i % 7 == 0:
        cnt += b

print(i)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from the standard input stream to integers, and the `split` method is used to split the input into three separate integers. The rest of the code is similar to the Java code, with the exception of the `print` statement, which is used to output the final result.</s>
