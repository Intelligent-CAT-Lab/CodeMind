<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
YES


```
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
```
[/INST]
```
import sys

a, b, c = map(int, sys.stdin.readline().split())

if a == 5 and b == 7 and c == 5 or a == 5 and b == 5 and c == 7 or a == 7 and b == 5 and c == 5:
    print("YES")
else:
    print("NO")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* The `if` statement checks if the three numbers are equal to 5, 7, and 5, or if they are equal to 5, 5, and 7, or if they are equal to 7, 5, and 5. If any of these conditions are met, it prints "YES", otherwise it prints "NO".</s>
