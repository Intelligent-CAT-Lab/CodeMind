System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 2

Expected output:
aYes

```
import java.util.*;

public class p03719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result = "No";
        if (a <= c && c <= b) result ="Yes";
        
        System.out.println(result);
      
    }
}

```


Answer:
```python
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    result = "No"
    if a <= c <= b:
        result = "Yes"
    print(result)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "1 3 2"
expected_output = "Yes"

def run_test(input_str, expected_output):
    sys.stdin = input_str
    main()
    out, _ = capsys.readouterr()
    assert out.strip() == expected_output

run_test(test_input, expected_output)
```<|endoftext|>
