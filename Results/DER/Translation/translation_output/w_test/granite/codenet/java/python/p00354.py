System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
fri


```
import java.util.Scanner;
public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}

```


Answer:
```python
import sys

def main():
    days = "thu:fri:sat:sun:mon:tue:wed".split(":")
    index = int(sys.stdin.read()) % 7
    print(days[index])

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys

def test_main():
    test_inputs = [
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
    ]
    expected_outputs = [
        "thu",
        "fri",
        "sat",
        "sun",
        "mon",
        "tue",
        "wed",
        "thu",
        "fri",
        "sat",
    ]
    for test_input, expected_output in zip(test_inputs, expected_outputs):
        sys.stdin = io.StringIO(test_input)
        sys.stdout = io.StringIO()
        main()
        actual_output = sys.stdout.getvalue().strip()
        assert actual_output == expected_output, f"Expected {expected_output}, got {actual_output}"

test_main()
```<|endoftext|>
