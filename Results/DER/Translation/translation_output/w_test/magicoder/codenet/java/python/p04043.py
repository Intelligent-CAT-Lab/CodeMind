<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
# Python code

# Get input from user
a, b, c = map(int, input().split())

# Check if the input matches the expected values
if (a == 5 and b == 5 and c == 7) or (a == 5 and b == 7 and c == 5) or (a == 7 and b == 5 and c == 5):
    print("YES")
else:
    print("NO")
```

This Python code does the same thing as the Java code. It reads three integers from the user, and then checks if they match the expected values. If they do, it prints "YES". If not, it prints "NO".<｜end▁of▁sentence｜>
