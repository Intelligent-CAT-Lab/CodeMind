System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 2 7

Expected output:
15


```
import java.util.Scanner;
public class p03826 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt(),b=sc.nextInt()*sc.nextInt();
		System.out.println((a<b)?b:a);
		sc.close();
	}
}
```


Answer:
```python
import sys

def main():
    a, b, c, d = map(int, sys.stdin.read().split())
    result = max(a * b, c * d)
    print(result)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "3 5 2 7"
expected_output = "15"

with patch('builtins.input', return_value=test_input):
    output = io.StringIO()
    with redirect_stdout(output):
        main()
    assert output.getvalue().strip() == expected_output
```<|endoftext|>
