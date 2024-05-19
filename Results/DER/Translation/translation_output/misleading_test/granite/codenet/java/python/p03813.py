System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000

Expected output:
6BC

```
import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}
```


Answer:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    if n < 1200:
        print("ABC")
    else:
        print("ARC")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys
from unittest.mock import patch

def test_main():
    test_inputs = [
        "1000",
    ]
    test_outputs = [
        "6BC",
    ]

    for test_input, test_output in zip(test_inputs, test_outputs):
        with patch("sys.stdin", io.StringIO(test_input)):
            with patch("sys.stdout", new_callable=io.StringIO) as fake_out:
                main()
                assert fake_out.getvalue() == test_output + "\n"

test_main()
```<|endoftext|>
