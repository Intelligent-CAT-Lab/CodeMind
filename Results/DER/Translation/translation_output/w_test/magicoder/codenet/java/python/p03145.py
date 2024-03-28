<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4 5

Expected output:
6


```
import java.util.Scanner;

/**
 *
 * @author kouki
 */
public class p03145 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        
        System.out.println((x*y)/2);
        
    }
    
}
```

@@ Response
```python
# Python code

# Get input from user
x, y, z = map(int, input().split())

# Calculate and print the result
print((x*y)//2)
```

In Python, we use the `input()` function to get input from the user. The `split()` function is used to split the input into separate values. The `map()` function is used to convert these values into integers. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
