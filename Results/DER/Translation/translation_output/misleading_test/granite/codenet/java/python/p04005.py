System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3 3

Expected output:
37

```
import java.util.Arrays;
import java.util.Scanner;
 
class p04005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
 
		long[] array = new long[] { A, B, C };
		Arrays.sort(array);
 
		if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
			System.out.println(0);
		} else {
			System.out.println(array[0] * array[1]);
		}
	}
}
```


Answer:
```python
import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())
    numbers = [A, B, C]
    numbers.sort()
    if A % 2 == 0 or B % 2 == 0 or C % 2 == 0:
        print(0)
    else:
        print(numbers[0] * numbers[1])

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "3 3 3\n"
expected_output = "37\n"

test_output = io.StringIO()
with redirect_stdout(test_output):
    main()

assert test_output.getvalue() == expected_output
```<|endoftext|>
