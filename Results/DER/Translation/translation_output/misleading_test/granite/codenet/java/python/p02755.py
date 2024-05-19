System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
50

```
import java.util.Scanner;

public class p02755 {
    public static void main(String[] args) {
        new p02755().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A > B) {
            System.out.println(-1);
            return;
        }

        for(int i = 1; i < 99999999; i ++) {
            if((int)(i * 0.08) == A &&  (int)(i * 0.10) == B) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}

```


Answer:
```python
import sys

def main():
    A, B = map(int, input().split())

    if A > B:
        print(-1)
        return

    for i in range(1, 99999999):
        if int(i * 0.08) == A and int(i * 0.10) == B:
            print(i)
            return

    print(-1)

if __name__ == "__main__":
    sys.exit(main())
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("2 2", 50),
    ("1 2", -1),
    ("10 100", 1250),
]
for test_input, expected_output in test_inputs:
    sys.stdin = io.StringIO(test_input)
    sys.stdout = io.StringIO()
    main()
    actual_output = sys.stdout.getvalue().strip()
    assert actual_output == str(expected_output)
```<|endoftext|>
