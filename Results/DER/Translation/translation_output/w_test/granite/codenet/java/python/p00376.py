System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 30

Expected output:
10


```
import java.util.Scanner;

public class p00376
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        ans=Math.abs(a-b);

        System.out.println(ans);
    }
}

```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.read().split())
    ans = abs(a - b)
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "20 30"
expected_output = "10"

def test_main():
    from io import StringIO
    from unittest.mock import patch
    with patch("sys.stdin", StringIO(test_input)):
        sys.stdout = StringIO()
        main()
        assert sys.stdout.getvalue() == expected_output + "\n"

test_main()
```<|endoftext|>
