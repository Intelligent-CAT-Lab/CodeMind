<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
8


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

This Python code reads a number from the standard input, cubes it, and then prints the result. The ```**``` operator in Python is equivalent to the ```*``` operator in Java, and ```int(sys.stdin.readline())``` is equivalent to ```Integer.valueOf(br.readLine())``` in Java.<｜end▁of▁sentence｜>
