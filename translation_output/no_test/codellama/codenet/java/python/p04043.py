<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p04043{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if(a== 5 && b == 7 && c ==5){
      	System.out.println("YES");
      }else if(a== 5 && b== 5 &&c ==7){
      	System.out.println("YES");
      }else if(a == 7 && b == 5&& c ==5){
      	System.out.println("YES");
      }else{
      	System.out.println("NO");
      }
    }
}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

a, b, c = map(int, sys.stdin.readline().split())

if a == 5 and b == 7 and c == 5:
    print("YES")
elif a == 5 and b == 5 and c == 7:
    print("YES")
elif a == 7 and b == 5 and c == 5:
    print("YES")
else:
    print("NO")
```
Note: The `map` function is used to convert the input from strings to integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` function is used to split the input into a list of strings.</s>
