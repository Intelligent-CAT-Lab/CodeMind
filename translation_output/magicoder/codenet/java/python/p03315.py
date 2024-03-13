<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03315 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = sc.next().toCharArray();
		int num=0;
		for (char c : ary) {
			if(c == '+') num++;
			else num--;
		}
		System.out.println(num);
	}
}


```

@@ Response
```python
# Python code

# Get input from user
input_str = input()

# Convert the string to a list of characters
ary = list(input_str)

# Initialize num to 0
num = 0

# Iterate over each character in the list
for c in ary:
    # If the character is '+', increment num
    if c == '+':
        num += 1
    # Otherwise, decrement num
    else:
        num -= 1

# Print the final value of num
print(num)
```

This Python code does the same thing as the Java code. It reads a string from the user, converts it to a list of characters, and then iterates over each character. If the character is '+', it increments a counter; if it's anything else, it decrements the counter. Finally, it prints the final value of the counter.<｜end▁of▁sentence｜>
