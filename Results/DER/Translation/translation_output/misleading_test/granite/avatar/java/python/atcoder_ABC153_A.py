System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10000 1

Expected output:
10046

```
import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long monsterHP = scan.nextLong();
        long servalATK = scan.nextLong();
        scan.close();

        long mod = monsterHP % servalATK;
        long ans = monsterHP / servalATK;

        if (mod > 0) {
            ans++;
        }

        System.out.println(ans);
    }
}
```


Answer:
```python
import sys

def main():
    monsterHP, servalATK = map(int, sys.stdin.readline().split())
    ans = (monsterHP + servalATK - 1) // servalATK
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("10000 1", "10000"),
    ("10000 2", "50000"),
    ("10000 100000000", "1"),
]
for test_input, expected_output in test_inputs:
    sys.stdin = open("input.txt", "w")
    sys.stdout = open("output.txt", "w")
    sys.stdin.write(test_input)
    sys.stdin.seek(0)
    main()
    sys.stdout.seek(0)
    actual_output = sys.stdout.read().strip()
    assert actual_output == expected_output, f"Expected {expected_output}, got {actual_output}"
```<|endoftext|>
