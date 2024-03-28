<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5 3

Expected output:
3 5 -91

```
import java.util.*;
public class p02439 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println(Math.min(min,c)+" "+Math.max(max,c));
    }
}

```

@@ Response
```python
# Python code

# Importing the required module
import sys

# Taking input from user
a, b, c = map(int, sys.stdin.readline().split())

# Finding the minimum and maximum of a and b
min_ab = min(a, b)
max_ab = max(a, b)

# Printing the minimum of min_ab and c and the maximum of max_ab and c
print(min(min_ab, c), max(max_ab, c))
```

In the above Python code, we are using the `sys.stdin.readline()` function to read the input from the user. The `map()` function is used to convert the input into integers. The `min()` and `max()` functions are used to find the minimum and maximum of the numbers. The `print()` function is used to print the output.<｜end▁of▁sentence｜>
