<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 4

Expected output:
Yay

```
import java.util.*;

public class p03323 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= 8 && b <= 8) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}

```

@@ Response
```python
# Python code

# Get input from user
a, b = map(int, input().split())

# Check if both numbers are less than or equal to 8
if a <= 8 and b <= 8:
    print("Yay!")
else:
    print(":(")
```

In this Python code, we use the `input()` function to get input from the user. The `split()` function is used to split the input into two numbers. The `map()` function is used to convert these strings into integers. The `if` statement checks if both numbers are less than or equal to 8, and if so, it prints "Yay!". If not, it prints ":(".<｜end▁of▁sentence｜>
