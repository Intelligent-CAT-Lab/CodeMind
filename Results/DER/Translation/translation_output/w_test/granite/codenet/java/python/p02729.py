System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
1


```
import java.util.Scanner;

public class p02729 {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			int n = sc.nextInt();
			int m = sc.nextInt();

			int nComb = n * (n-1) / 2;
			int mComb = m * (m-1) / 2;
			
			System.out.println(nComb + mComb);
			
		}
	}

}
```


Answer:
```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    n_comb = n * (n-1) // 2
    m_comb = m * (m-1) // 2
    print(n_comb + m_comb)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys
from unittest.mock import patch

def test_main():
    test_input = "2 1"
    expected_output = "1"
    with patch("sys.stdin", io.StringIO(test_input)):
        with patch("sys.stdout", new_callable=io.StringIO) as fake_out:
            main()
            actual_output = fake_out.getvalue().strip()
            assert actual_output == expected_output
```<|endoftext|>
