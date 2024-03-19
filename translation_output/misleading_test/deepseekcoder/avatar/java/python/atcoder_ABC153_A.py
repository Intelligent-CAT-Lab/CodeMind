<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import sys

def atcoder_ABC153_A():
    monsterHP, servalATK = map(int, sys.stdin.readline().split())

    mod = monsterHP % servalATK
    ans = monsterHP // servalATK

    if mod > 0:
        ans += 1

    print(ans)

atcoder_ABC153_A()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the modulus and integer division, and then prints the result. If the modulus is greater than 0, it adds 1 to the result.
<|EOT|>
