<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

# importing the required module
import sys

# reading input from user
x = int(sys.stdin.readline())
y = int(sys.stdin.readline())
z = int(sys.stdin.readline())

# printing the result
print((x*y)//2)
```

In Python, we don't need to import any specific module for input. We can directly use the `sys.stdin.readline()` function to read input from the user. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
