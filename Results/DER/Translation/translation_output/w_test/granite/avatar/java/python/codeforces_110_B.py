System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
abcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcd

```
import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println('a');
        } else if (n == 2) {
            System.out.println("ab");
        } else if (n == 3) {
            System.out.println("abc");
        } else {
            for (int i = 0; i < n / 4; i++) {
                System.out.print("abcd");
            }
            int t = n % 4;
            if (t == 1) {
                System.out.println('a');
            } else if (t == 2) {
                System.out.println("ab");
            } else if (t == 3) {
                System.out.println("abc");
            }
        }
    }
}
```


Answer:
```python
n = int(input())

if n == 1:
    print('a')
elif n == 2:
    print("ab")
elif n == 3:
    print("abc")
else:
    for i in range(n // 4):
        print("abcd", end="")
    t = n % 4
    if t == 1:
        print('a')
    elif t == 2:
        print("ab")
    elif t == 3:
        print("abc")
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
expected_outputs = ['a', 'ab', 'abc', 'abcd', 'abcdab', 'abcdabc', 'abcdabcd', 'abcdabcdab', 'abcdabcdabc', 'abcdabcdabcd']

for test_input, expected_output in zip(test_inputs, expected_outputs):
    actual_output = str(code(test_input))
    assert actual_output == expected_output, f"Expected {expected_output}, but got {actual_output} for input {test_input}"
```<|endoftext|>
