System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1000000


```
import java.util.*;
 
public class p02853 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        if (X == 1 && Y == 1) {
            ans = 1000000;
        } else {
            if (X == 1) {
                ans += 300000;
            }
            if (Y == 1) {
                ans += 300000;
            }
            if (X == 2) {
                ans += 200000;
            }
            if (Y == 2) {
                ans += 200000;
            }
            if (X == 3) {
                ans += 100000;
            }
            if (Y == 3) {
                ans += 100000;
            }
        }
        System.out.println(ans);
    }
}

```


Answer:
```python
import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())
    ans = 0
    if X == 1 and Y == 1:
        ans = 1000000
    else:
        if X == 1:
            ans += 300000
        if Y == 1:
            ans += 300000
        if X == 2:
            ans += 200000
        if Y == 2:
            ans += 200000
        if X == 3:
            ans += 100000
        if Y == 3:
            ans += 100000
    print(ans)

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
        ("1 1\n", "1000000\n"),
        ("1 2\n", "300000\n"),
        ("2 3\n", "500000\n"),
    ]
    for test_input, expected_output in test_inputs:
        with patch("sys.stdin", io.StringIO(test_input)):
            with patch("sys.stdout", new_callable=io.StringIO) as fake_out:
                main()
                assert fake_out.getvalue() == expected_output
```<|endoftext|>
