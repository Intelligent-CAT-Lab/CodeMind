<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3882

```
import java.util.Scanner;

public class p03551 {

	public static void main(String[] args) {
		p03551 m = new p03551();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		long base = n*100+m*1800;
		
		System.out.println(base << m);
		
	}
}

```

### Response:
```python
import sys

class p03551:

    def __init__(self):
        pass

    def run(self):

        n, m = map(int, sys.stdin.readline().split())
        
        base = n*100+m*1800
        
        print(base << m)

if __name__ == "__main__":
    m = p03551()
    m.run()
```

In the Python version, we use `sys.stdin.readline()` to read the input from the console. The `map()` function is used to convert the input into integers. The `<<` operator is used for bitwise left shift operation in Python.
<|EOT|>
