<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p03463 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int k = b - a;
		if(k % 2 == 1) System.out.println("Borys");
		else System.out.println("Alice");
	}
}
```

### Response:
```python
import sys

def main():
    n, a, b = map(int, sys.stdin.readline().split())
    k = b - a
    if k % 2 == 1:
        print("Borys")
    else:
        print("Alice")

if __name__ == "__main__":
    main()
```
<|EOT|>
