System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
2
0
11


```
import java.util.Arrays;
import java.util.Scanner;

public class p02223 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		if (N == 1) {
			System.out.println(1);
			System.out.println("0");
		} else if (N == 2) {
			System.out.println(2);
			System.out.println("0");
			System.out.println("11");
		} else {
			System.out.println(N - 1);
			for (int i = 2; i <= N; i++) {
				char[] s = new char[i];
				Arrays.fill(s, '1');
				s[0] = s[i - 1] = '0';
				System.out.println(String.valueOf(s));
			}
		}
	}

}

```


Answer:
```python
import sys

def main():
    N = int(input())
    if N == 1:
        print(1)
        print("0")
    elif N == 2:
        print(2)
        print("0")
        print("11")
    else:
        print(N - 1)
        for i in range(2, N + 1):
            s = ['1'] * i
            s[0] = s[-1] = '0'
            print(''.join(s))

if __name__ == "__main__":
    sys.exit(main())
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "2",
    "3",
    "4",
]

test_outputs = [
    "2\n0\n11",
    "3\n0\n11\n010",
    "4\n0\n11\n010\n1001",
]

def test_p02223():
    from io import StringIO
    from unittest import mock

    for test_input, test_output in zip(test_inputs, test_outputs):
        with mock.patch('sys.stdin', StringIO(test_input)):
            with mock.patch('sys.stdout', new_callable=StringIO) as fake_out:
                main()
                assert fake_out.getvalue() == test_output

test_p02223()
```<|endoftext|>
