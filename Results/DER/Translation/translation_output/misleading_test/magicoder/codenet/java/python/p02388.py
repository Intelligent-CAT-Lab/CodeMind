<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
-16

```
import java.io.BufferedReader;
import java.io.InputStreamReader;

class p02388 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		System.out.println(num*num*num);
	}

}
```

@@ Response
```python
import sys

def main():
    num = int(sys.stdin.readline())
    print(num**3)

if __name__ == "__main__":
    main()
```

In Python, the equivalent code would be:

```python
import sys

def main():
    num = int(sys.stdin.readline())
    print(num**3)

if __name__ == "__main__":
    main()
```

This Python code reads an integer from the standard input (sys.stdin.readline()), cubes it (num**3), and then prints the result.<｜end▁of▁sentence｜>
