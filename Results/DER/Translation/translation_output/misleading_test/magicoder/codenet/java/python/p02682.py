<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1 1 3

Expected output:
29

```
import java.util.*;

public class p02682{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    int sum = 0;
    if (d<=a){
      System.out.println(d);
      return;
    }
    sum = a;
    d -= a;
    if(d<=b){
      System.out.println(sum);
      return;
    }
    d-=b;
    sum -= d;
    System.out.println(sum);
  }
}

```

@@ Response
```python
# Python code

# Read input
a, b, c, d = map(int, input().split())

# Initialize sum
sum = 0

# Check if d is less than or equal to a
if d <= a:
    print(d)
    exit()

# Add a to sum
sum += a

# Subtract a from d
d -= a

# Check if d is less than or equal to b
if d <= b:
    print(sum)
    exit()

# Subtract b from d
d -= b

# Subtract d from sum
sum -= d

# Print sum
print(sum)
```

This Python code does the same thing as the Java code. It reads four integers from the input, checks if the fourth integer is less than or equal to the first, and if so, prints it. If not, it adds the first integer to a sum, subtracts the first integer from the fourth, checks if the remaining fourth integer is less than or equal to the second, and if so, prints the sum. If not, it subtracts the second integer from the fourth and subtracts the remaining fourth integer from the sum, and finally prints the sum.<｜end▁of▁sentence｜>
