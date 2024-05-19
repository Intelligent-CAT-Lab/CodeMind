System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4

Expected output:
Even


```
import java.util.Scanner;

public class p03455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		if (X%2==0||Y%2==0) {
			System.out.println("Even");
			return ;
		}
		System.out.println("Odd");
	}
}
```


Answer:
```python
import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())
    if X % 2 == 0 or Y % 2 == 0:
        print("Even")
    else:
        print("Odd")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input_1 = "3 4"
expected_output_1 = "Even"
test_input_2 = "1 2"
expected_output_2 = "Odd"

sys.stdin = io.StringIO(test_input_1)
assert main() == expected_output_1
sys.stdin = io.StringIO(test_input_2)
assert main() == expected_output_2
```<|endoftext|>
