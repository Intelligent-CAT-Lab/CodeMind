<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
YES


```
import java.util.*;
import java.math.BigDecimal;

public class p03210 {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
      
      	if(age == 3 || age == 5 || age == 7) {
        	System.out.println("YES");
        } else {
          	System.out.println("NO");
        }

    }
}
```

### Response:
```python
import sys

def main():
    age = int(sys.stdin.readline())
    if age == 3 or age == 5 or age == 7:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

In Python, we don't need to import any libraries for input and output. We can use `sys.stdin.readline()` to read input from the standard input. The `print()` function is used to output to the standard output.

The `if __name__ == "__main__":` line is a common idiom in Python to indicate that the code should only be run when this file is run directly, not when it's imported as a module.
<|EOT|>
