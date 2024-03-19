<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
700 600 780

Expected output:
1222

```
import java.util.*;
public class p03671{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] sum = {a,b,c};
        Arrays.sort(sum);

        System.out.println(sum[0]+sum[1]);
    }

}

```

@@ Response
```python
# Python code

# Importing the required module
import sys

# Taking input from the user
a, b, c = map(int, sys.stdin.readline().split())

# Creating a list of the input numbers
numbers = [a, b, c]

# Sorting the list
numbers.sort()

# Printing the sum of the first two numbers in the sorted list
print(numbers[0] + numbers[1])
```

In the above Python code, we are using the `sys.stdin.readline()` function to read the input from the user. The `map()` function is used to convert the input string into integers. The `split()` function is used to split the input string into individual numbers. The `sort()` function is used to sort the list of numbers in ascending order. Finally, the sum of the first two numbers in the sorted list is printed.<｜end▁of▁sentence｜>
