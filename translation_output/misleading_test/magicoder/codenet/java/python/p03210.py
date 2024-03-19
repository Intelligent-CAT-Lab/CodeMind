<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
ES

```
import java.util.*;
import java.math.BigDecimal;

public class p03210 {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
      
      	if(age == 3 || age == 5 || age == 7) {
        	System.out.println("YES");
        } else {
          	System.out.println("NO");
        }

    }
}
```

@@ Response
```python
import sys

def main():
    age = int(sys.stdin.readline())

    if age == 3 or age == 5 or age == 7:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `int()` function is used to convert the input string to an integer. The `if` statement checks if the age is either 3, 5, or 7, and prints "YES" if it is, otherwise it prints "NO".<｜end▁of▁sentence｜>
