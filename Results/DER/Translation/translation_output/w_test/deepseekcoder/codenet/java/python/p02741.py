<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
2


```
import java.util.*;
public class p02741 {
	static int a[]= {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
	 int k=input.nextInt();
	 System.out.println(a[k-1]);
 }
}

```

### Response:
```python
a = [1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51]

def main():
    k = int(input())
    print(a[k-1])

if __name__ == "__main__":
    main()
```

In this Python code, we first define the list `a` as in the Java code. Then we define a function `main()` that reads an integer from the standard input, prints the corresponding element from the list `a`, and then we call this function if the script is run directly.
<|EOT|>
