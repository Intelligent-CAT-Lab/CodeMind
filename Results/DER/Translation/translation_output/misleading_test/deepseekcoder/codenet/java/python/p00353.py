<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 3000 3000

Expected output:
2032

```
import java.util.Scanner;

public class p00353 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] input = sc.nextLine().split(" ");
      int m = Integer.parseInt(input[0]);
      int f = Integer.parseInt(input[1]);
      int b = Integer.parseInt(input[2]);
      
      if(b > m + f) {
         System.out.println("NA"); 
      } else if (b > m){
         System.out.println(b - m);
      } else {
         System.out.println("0");
      }
   }
}

```

### Response:
```python
def p00353(m, f, b):
    if b > m + f:
        return "NA"
    elif b > m:
        return b - m
    else:
        return 0

# Test input
m, f, b = 1000, 3000, 3000

# Call the function with test input
print(p00353(m, f, b))
```

This Python code does the same thing as the Java code. It defines a function `p00353` that takes three arguments: `m`, `f`, and `b`. It checks if `b` is greater than the sum of `m` and `f`, in which case it returns "NA". If `b` is greater than `m`, it returns the difference between `b` and `m`. Otherwise, it returns 0. The test input is then defined and the function is called with these inputs.
<|EOT|>
