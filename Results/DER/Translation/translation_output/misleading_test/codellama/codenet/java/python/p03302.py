<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 11

Expected output:
+

```
import java.util.*;
public class p03302{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	if(a+b==15){
        	System.out.println("+");
        }else if(a*b==15){
        	System.out.println("*");
        }else{
        	System.out.println("x");
        }
    }
}
```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

if a + b == 15:
    print("+")
elif a * b == 15:
    print("*")
else:
    print("x")
```
Note: The `map` function is used to convert the input strings to integers. The `split` method is used to split the input string into two parts, and the `int` function is used to convert the two parts to integers. The `readline` method is used to read a line of input from the standard input stream.</s>
