System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 2

Expected output:
Yes


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
    if a <= c <= b:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "1 3 2"
expected_output = "Yes"
output = get_output(test_input)
assert output == expected_output, "Expected output: {}, Actual output: {}".format(expected_output, output)

test_input = "1 3 4"
expected_output = "No"
output = get_output(test_input)
assert output == expected_output, "Expected output: {}, Actual output: {}".format(expected_output, output)
```<|endoftext|>
