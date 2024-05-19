System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
45 99

Expected output:
45 27


```
import java.util.*;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int count = 0;
        while (true) {
            if (a > 0 && b > 0) {
                count++;
                a--;
                b--;
            } else break;
        }
        int ans = a / 2 + b / 2;
        System.out.println(count + " " + ans);
    }
}
```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    count = 0
    while a > 0 and b > 0:
        count += 1
        a -= 1
        b -= 1
    ans = a // 2 + b // 2
    print(count, ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "45 99"
expected_output = "45 27"
output = get_output(test_input)
assert output == expected_output
```<|endoftext|>
