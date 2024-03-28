<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 14 80

Expected output:
3


```
import java.util.Scanner;

public class p02398 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    int t = 0;
	    for (int i = x; i <= y; i++) {
	    	if (z % i == 0)
	    		t++;
	    } System.out.println(t);
     }
}


```

@@ Response
```python
# Python code

# Read input from user
x, y, z = map(int, input().split())

# Initialize counter
t = 0

# Loop through numbers from x to y
for i in range(x, y+1):
    # Check if z is divisible by i
    if z % i == 0:
        # Increment counter
        t += 1

# Print the counter
print(t)
```

This Python code does the same thing as the Java code. It reads three integers from the user, then counts how many of the numbers between x and y are divisible by z. The result is then printed to the console.<｜end▁of▁sentence｜>
