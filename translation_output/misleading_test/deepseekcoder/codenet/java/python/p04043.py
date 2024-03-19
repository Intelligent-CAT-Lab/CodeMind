<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
UDS

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

### Response:
```python
def p04043():
    a, b, c = map(int, input().split())

    if(a== 5 and b == 7 and c ==5):
       print("YES")
    elif(a== 5 and b== 5 and c ==7):
       print("YES")
    elif(a == 7 and b == 5 and c ==5):
       print("YES")
    else:
       print("NO")

p04043()
```

In this Python code, we are using the `input().split()` function to read the input from the user. This function splits the input into a list of strings, and the `map()` function is used to convert these strings into integers. The `if`, `elif`, and `else` statements are used to check the conditions specified in the Java code.
<|EOT|>
