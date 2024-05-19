System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2

Expected output:
3


```
import java.util.*;

public class p03272 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        
        System.out.println(N-K+1);
    }
}

```


Answer:
```python
import sys

def main():
    N, K = map(int, sys.stdin.readline().split())
    print(N - K + 1)

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
        ("4 2\n", "3\n"),
    ]
    for test_input, expected_output in test_inputs:
        with patch("sys.stdin", io.StringIO(test_input)):
            with patch("sys.stdout", new_callable=io.StringIO) as fake_out:
                main()
                actual_output = fake_out.getvalue()
                assert actual_output == expected_output

test_main()
```<|endoftext|>
