System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3400

```
import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b)
            for (int i = 0; i < a; i++)
                System.out.print(b);
        else
            for (int i = 0; i < b; i++)
                System.out.print(a);

    }
}

```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if a >= b:
        print(str(b) * a)
    else:
        print(str(a) * b)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input_1 = "4 3"
expected_output_1 = "3400"
test_input_2 = "10 5"
expected_output_2 = "5555555"
test_input_3 = "5 10"
expected_output_3 = "5555"

actual_output_1 = main(test_input_1)
actual_output_2 = main(test_input_2)
actual_output_3 = main(test_input_3)

assert actual_output_1 == expected_output_1
assert actual_output_2 == expected_output_2
assert actual_output_3 == expected_output_3
```<|endoftext|>
