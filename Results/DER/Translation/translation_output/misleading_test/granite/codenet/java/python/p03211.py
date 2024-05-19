System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234567876

Expected output:
110

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
import re

def main():
    S = input()
    min_diff = 1000
    for i in range(len(S) - 2):
        X = int(S[i:i+3])
        diff = abs(X - 753)
        if diff < min_diff:
            min_diff = diff
    print(min_diff)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "1234567876"
expected_output = 110
output = main()
assert output == expected_output, "Expected output {}, got {}".format(expected_output, output)
```<|endoftext|>
