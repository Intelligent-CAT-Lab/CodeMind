<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p02922 {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = (b-1)/(a-1);
    if((b-1)%(a-1)==0) {
    	System.out.println(ans);
    }else {
    	System.out.println(ans+1);
    }
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

ans = (b - 1) // (a - 1)
if (b - 1) % (a - 1) == 0:
    print(ans)
else:
    print(ans + 1)
```
Note: The `map` function is used to convert the input strings to integers, and the `//` operator is used for integer division. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream.</s>
