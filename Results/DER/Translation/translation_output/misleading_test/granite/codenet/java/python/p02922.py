System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 10

Expected output:
32

```
import java.util.Scanner;
public class p02922 {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = (b-1)/(a-1);
    if((b-1)%(a-1)==0) {
    	System.out.println(ans);
    }else {
    	System.out.println(ans+1);
    }
    }
}
```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    ans = (b-1) // (a-1)
    if (b-1) % (a-1) == 0:
        print(ans)
    else:
        print(ans+1)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("4 10", "32"),
    ("1 10", "10"),
    ("2 10", "5"),
    ("3 10", "3"),
]
for test_input, expected_output in test_inputs:
    sys.stdin = io.StringIO(test_input)
    sys.stdout = io.StringIO()
    main()
    actual_output = sys.stdout.getvalue().strip()
    assert actual_output == expected_output, f"Expected {expected_output}, got {actual_output}"
```<|endoftext|>
