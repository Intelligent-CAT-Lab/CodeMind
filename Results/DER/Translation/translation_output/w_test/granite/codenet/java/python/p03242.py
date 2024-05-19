System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
119

Expected output:
991


```
import java.util.*;

public class p03242 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    for (int i = 0; i < 3; i++) S[i] = (S[i] == '1')? '9' : '1';
    System.out.println(S);
  }
}
```


Answer:
```python
def main():
    S = input()
    S = list(S)
    for i in range(3):
        if S[i] == '1':
            S[i] = '9'
        else:
            S[i] = '1'
    print(''.join(S))

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "119",
    "999",
    "111",
]

expected_outputs = [
    "991",
    "111",
    "999",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    test_output = main(test_input)
    assert test_output == expected_output, f"Expected {expected_output}, got {test_output}"
```<|endoftext|>
