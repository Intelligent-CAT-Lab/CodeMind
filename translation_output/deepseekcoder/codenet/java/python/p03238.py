<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03238{
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		if(n == 1)System.out.println("Hello World");
		else {
			int a = fs.nextInt(),b = fs.nextInt();
			System.out.println(a+b);
		}
		fs.close();
	}
}
```

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    if n == 1:
        print("Hello World")
    else:
        a, b = map(int, sys.stdin.readline().split())
        print(a + b)

if __name__ == "__main__":
    main()
```
<|EOT|>
