<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean[] a = new boolean[100000];
        long MOD = 1000000007;

        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i) == '1';
        }

        long an = 0;
        long[] pow2 = new long[100005];
        long[] pow3 = new long[100005];
        long cp2 = 1;
        long cp3 = 1;

        for (int i = 0; i < 100005; i++) {
            pow2[i] = cp2;
            pow3[i] = cp3;
            cp2 = (cp2 * 2) % MOD;
            cp3 = (cp3 * 3) % MOD;
        }

        int ones = 0;

        for (int i = 0; i < n; i++) {
            if (a[i]) {
                int digle = n - i - 1;
                long cur = (pow3[digle] * pow2[ones]) % MOD;
                an = (an + cur) % MOD;
                ones++;
            } else {
            }
        }

        long cur = (pow2[ones]) % MOD;
        an = (an + cur) % MOD;

        System.out.println(an);
    }
}
```

@@ Response
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    n = len(s)
    a = [0] * 100000
    MOD = 1000000007

    for i in range(n):
        a[i] = s[i] == '1'

    an = 0
    pow2 = [0] * 100005
    pow3 = [0] * 100005
    cp2 = 1
    cp3 = 1

    for i in range(100005):
        pow2[i] = cp2
        pow3[i] = cp3
        cp2 = (cp2 * 2) % MOD
        cp3 = (cp3 * 3) % MOD

    ones = 0

    for i in range(n):
        if a[i]:
            digle = n - i - 1
            cur = (pow3[digle] * pow2[ones]) % MOD
            an = (an + cur) % MOD
            ones += 1
        else:
            pass

    cur = (pow2[ones]) % MOD
    an = (an + cur) % MOD

    print(an)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, converts it to a list of boolean values, and then calculates the answer. The `pow2` and `pow3` arrays are used to store the powers of 2 and 3 modulo `MOD`, and the `ones` variable is used to count the number of ones in the string. The `cur` variable is used to store the current value of the answer, and it is updated in each iteration of the loop. The final answer is printed out.<｜end▁of▁sentence｜>
