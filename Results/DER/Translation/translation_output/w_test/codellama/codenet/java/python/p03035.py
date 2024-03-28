<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
30 100

Expected output:
100


```
import java.util.*;

class p03035{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a<=5){
      System.out.println(0);
    }
    else if(a<=12){
      System.out.println((int)(b/2));
    }
    else{
      System.out.println(b);
    }
  }
}
```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

if a <= 5:
    print(0)
elif a <= 12:
    print(int(b / 2))
else:
    print(b)
```
Note: The `map` function is used to convert the input strings to integers. The `split` method is used to split the input string into two parts, and the `int` function is used to convert the strings to integers. The `readline` method is used to read a line of input from the standard input stream.</s>
