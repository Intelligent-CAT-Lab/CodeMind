System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
615

Expected output:
27

```
import java.util.Scanner;

public class p02843 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 100 <= x / 100 * 5) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
```


Answer:
```python
x = int(input())
if x % 100 <= x // 100 * 5:
    print(1)
else:
    print(0)
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "615",
    "100",
    "500",
    "999",
]

expected_outputs = [
    "27",
    "1",
    "1",
    "1",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    actual_output = str(p02843(test_input))
    assert actual_output == expected_output, f"Expected {expected_output}, got {actual_output} for input {test_input}"
```<|endoftext|>
