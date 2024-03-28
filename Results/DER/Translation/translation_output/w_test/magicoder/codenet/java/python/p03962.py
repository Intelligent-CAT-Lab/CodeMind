<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
3


```
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03962 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Set<Integer> paintCans = new HashSet<Integer>();
		paintCans.add(scan.nextInt());
		paintCans.add(scan.nextInt());
		paintCans.add(scan.nextInt());

		System.out.println(paintCans.size());
	}

}
```

@@ Response
```python
# Python code

# Importing the required module
import sys

# Reading input from the user
input_values = list(map(int, sys.stdin.readline().split()))

# Creating a set to store the paint cans
paint_cans = set()

# Adding the input values to the set
for value in input_values:
    paint_cans.add(value)

# Printing the size of the set
print(len(paint_cans))
```

In this Python code, we are using the `sys.stdin.readline()` function to read the input from the user. The `map()` function is used to convert the input string into integers. The `set()` function is used to create a set to store the paint cans. The `add()` function is used to add the input values to the set. Finally, the `len()` function is used to print the size of the set, which is the number of unique paint cans.<｜end▁of▁sentence｜>
