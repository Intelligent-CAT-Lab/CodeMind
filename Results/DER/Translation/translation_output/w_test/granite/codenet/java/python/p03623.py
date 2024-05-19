System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2 7

Expected output:
B


```
import java.util.Scanner;
public class p03623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x-a) < Math.abs(x-b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```


Answer:
```python
import sys

def main():
    x, a, b = map(int, sys.stdin.readline().split())
    if abs(x - a) < abs(x - b):
        print("A")
    else:
        print("B")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "5 2 7"
expected_output = "B"
output = get_output(test_input)
assert output == expected_output
```<|endoftext|>
