System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 10

Expected output:
Hom


```
import java.util.Scanner;

public class p02054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
		}
		System.out.println(odd >= 2? "Hom" : "Tem");
	}
}


```


Answer:
```python
def main():
    odd = 0
    for i in range(3):
        odd += int(input()) % 2
    print("Hom" if odd >= 2 else "Tem")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys
from unittest import mock

def test_odd_count():
    capturedOutput = io.StringIO()
    sys.stdout = capturedOutput
    main()
    sys.stdout = sys.__stdout__
    assert capturedOutput.getvalue() == "Hom\n"

def test_even_count():
    capturedOutput = io.StringIO()
    sys.stdout = capturedOutput
    main()
    sys.stdout = sys.__stdout__
    assert capturedOutput.getvalue() == "Tem\n"
```<|endoftext|>
