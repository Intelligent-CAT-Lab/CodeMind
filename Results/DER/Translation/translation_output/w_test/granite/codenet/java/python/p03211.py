System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234567876

Expected output:
34


```
import java.util.Scanner;

public class p03211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int min = 1000;
        for (int i = 0; i < S.length() - 2; i++) {
            int X = Integer.parseInt(S.substring(i, i + 3));
            min = Math.min(min, Math.abs(X - 753));
        }
        System.out.println(min);
        sc.close();
    }
}
```


Answer:
```python
S = input()
min_diff = 1000
for i in range(len(S) - 2):
    X = int(S[i:i+3])
    diff = abs(X - 753)
    if diff < min_diff:
        min_diff = diff
print(min_diff)
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "1234567876",
    "1234567890",
    "9876543210",
]
expected_outputs = [
    34,
    1,
    1,
]
for test_input, expected_output in zip(test_inputs, expected_outputs):
    assert p03211(test_input) == expected_output
```<|endoftext|>
