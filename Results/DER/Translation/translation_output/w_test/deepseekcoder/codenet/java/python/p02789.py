<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3

Expected output:
Yes


```
import java.util.*;
public class p02789{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    if (n==m) {
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
 
  }
}
```

### Response:
```python
import sys

n, m = map(int, sys.stdin.readline().split())

if n == m:
    print("Yes")
else:
    print("No")
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. If the two numbers are equal, "Yes" is printed; otherwise, "No" is printed.
<|EOT|>
