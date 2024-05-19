System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10000 1

Expected output:
10000


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
]

def test_main():
    from io import StringIO
    for test_input, expected_output in test_inputs:
        sys.stdin = StringIO(test_input)
        sys.stdout = StringIO()
        main()
        assert sys.stdout.getvalue() == expected_output + "\n"

test_main()
```<|endoftext|>
