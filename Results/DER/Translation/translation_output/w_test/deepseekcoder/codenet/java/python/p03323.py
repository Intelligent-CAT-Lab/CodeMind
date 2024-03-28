<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 4

Expected output:
Yay!


```
import java.util.*;

public class p03323 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= 8 && b <= 8) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}

```

### Response:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if a <= 8 and b <= 8:
        print("Yay!")
    else:
        print(":(")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. If both `a` and `b` are less than or equal to 8, the program prints "Yay!". Otherwise, it prints ":(".
<|EOT|>
