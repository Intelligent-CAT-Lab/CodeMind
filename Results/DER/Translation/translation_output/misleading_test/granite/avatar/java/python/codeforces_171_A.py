System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
35005211 521595368

Expected output:
898600302

```
import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans = getNum(a, b);
        System.out.println(ans);
    }

    public static int getNum(int a, int b) {
        int reverseB = 0;
        while (b > 0) {
            reverseB = reverseB * 10 + b % 10;
            b /= 10;
        }
        return a + reverseB;
    }
}
```


Answer:
```python
def getNum(a, b):
    reverseB = 0
    while b > 0:
        reverseB = reverseB * 10 + b % 10
        b //= 10
    return a + reverseB

def main():
    a, b = map(int, input().split())
    ans = getNum(a, b)
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    ((35005211, 521595368), 898600302),
    ((123, 456), 579),
    ((10, 20), 30),
    ((123456789, 987654321), 211111110)
]
for test_input, expected_output in test_cases:
    assert getNum(*test_input) == expected_output
```<|endoftext|>
