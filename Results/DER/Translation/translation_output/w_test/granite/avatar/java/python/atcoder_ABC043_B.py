System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
0000000000


```
import java.util.*;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        while (s.contains("0B ") || s.contains("1B ")) {
            s = s.replaceAll("0B ", "");
            s = s.replaceAll("1B ", "");
        }
        
        s = s.replaceAll(" B ", "");
        
        System.out.println(s);
    }
}
```


Answer:
```python
import re

def remove_zero_one_b(s):
    s = re.sub(r'0B |1B ', '', s)
    s = re.sub(r' B ', '', s)
    return s

def main():
    s = input()
    result = remove_zero_one_b(s)
    print(result)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    ("0000000000", "0000000000"),
    ("111111111", "111111111"),
    ("0B 1B 0B 1B", ""),
    ("0B 1B 0B 1B 0B 1B", ""),
    ("0B 1B 0B 1B 0B 1B 0B 1B", ""),
]

for test_input, expected_output in test_cases:
    assert remove_zero_one_b(test_input) == expected_output
```<|endoftext|>
