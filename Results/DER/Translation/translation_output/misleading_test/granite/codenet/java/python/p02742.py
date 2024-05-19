System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5

Expected output:
95

```
import java.util.Scanner;

public class p02742 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
		long h = scan.nextLong();

		if(w == 1 || h == 1) {
			System.out.println(1);
			return;
		}
		long c = (w*h)%2 == 0? (w*h)/2 : (w*h)/2+1;
		System.out.println(c);
	}

}
```


Answer:
```python
import sys

def main():
    w, h = map(int, sys.stdin.readline().split())
    if w == 1 or h == 1:
        print(1)
        return
    c = (w * h) // 2 + (w * h) % 2
    print(c)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "4 5"
expected_output = "95"

with patch('builtins.input', side_effect=[test_input]):
    output = io.StringIO()
    with redirect_stdout(output):
        main()
    assert output.getvalue().strip() == expected_output
```<|endoftext|>
