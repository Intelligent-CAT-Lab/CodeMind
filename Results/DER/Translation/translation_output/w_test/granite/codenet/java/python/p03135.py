System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 3

Expected output:
2.6666666667


```
import java.util.Scanner;

public class p03135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		double a;
		a = (double) T / X;
		System.out.println(a);
	}
}

```


Answer:
```python
import sys

def main():
    T, X = map(int, sys.stdin.readline().split())
    a = T / X
    print(a)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys
from unittest.mock import patch

def test_main():
    with patch("sys.stdin", io.StringIO("8 3")):
        with patch("sys.stdout", new_callable=io.StringIO) as fake_out:
            main()
            assert fake_out.getvalue() == "2.6666666667\n"
```<|endoftext|>
