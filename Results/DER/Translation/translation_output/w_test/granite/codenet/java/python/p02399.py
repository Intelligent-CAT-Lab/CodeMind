System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1 1 1.50000


```
import java.util.Scanner;

public class p02399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f",  1.0 * a / b);
		
		System.out.printf("%d %d %s", d, r, f);
		
	}

}
```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    d = a // b
    r = a % b
    f = "{:.5f}".format(a / b)
    print(d, r, f)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "3 2"
expected_output = "1 1 1.50000"

with patch('builtins.input', side_effect=[test_input]):
    output = io.StringIO()
    with redirect_stdout(output):
        main()
    assert output.getvalue().strip() == expected_output
```<|endoftext|>
