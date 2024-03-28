<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
x, y, z = map(int, input().split())
print((x*y)//2)
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the product of the first two divided by 2, and prints the result. The `//` operator is used for integer division in Python.
<|EOT|>
