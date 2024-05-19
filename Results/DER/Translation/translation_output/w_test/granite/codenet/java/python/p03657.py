System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5

Expected output:
Possible


```
import java.util.Scanner;

public class p03657 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) System.out.println("Possible");
        else System.out.println("Impossible");
    }
}
```


Answer:
```python
a, b = map(int, input().split())
if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
    print("Possible")
else:
    print("Impossible")
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    ("4 5", "Possible"),
    ("1 2", "Impossible"),
    ("3 6", "Possible"),
    ("9 9", "Possible"),
]
for input_str, expected_output in test_cases:
    input_str = "4 5"
    with patch('builtins.input', return_value=input_str):
        actual_output = main()
        assert actual_output == expected_output, f"Expected {expected_output}, but got {actual_output}"
```<|endoftext|>
