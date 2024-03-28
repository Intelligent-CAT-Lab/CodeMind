<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1101

Expected output:
-88

```
def solve(t):
    res = 0
    length = 0
    n = len(t)
    used = [0] * n
    # insert 1 greedy
    for i in range(n):
        if t[i] == "1":
            length += 1
            res += (length + 1) // 2
            used[i] = 1

    # insert 0 greedy
    cnt_temp = 0
    for i in range(n):
        if used[i]:
            cnt_temp += 1
        elif cnt_temp % 2 == 1:
            # add 0 if it is 2, 4, 6 th
            cnt_temp += 1
            length += 1
            res += (length + 1) // 2
            used[i] = 1

    cnt_unused = n - sum(used)
    switch_count = 0
    # split by other 0
    st = 0
    cnt_1_even = 0
    cnt_1_odd = 0
    for i in range(n):
        if used[i] == 0:
            switched = (switch_count + 1) // 2
            non_switched = cnt_unused - switched
            res += cnt_1_even * non_switched + cnt_1_odd * switched
            st = i + 1
            switch_count += 1
            cnt_1_even = 0
            cnt_1_odd = 0
        if t[i] == "1":
            if (i - st) % 2 == 0:
                cnt_1_even += 1
            else:
                cnt_1_odd += 1

    # add last
    switched = (switch_count + 1) // 2
    non_switched = cnt_unused - switched
    res += cnt_1_even * non_switched + cnt_1_odd * switched

    return res


def main():
    t = input()
    res = solve(t)
    print(res)


def test():
    assert solve("1101") == 5
    assert solve("0111101101") == 26


if __name__ == "__main__":
    test()
    main()

```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.next();
        System.out.println(solve(t));
    }

    public static int solve(String t) {
        int res = 0;
        int length = 0;
        int n = t.length();
        boolean[] used = new boolean[n];

        // insert 1 greedy
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == '1') {
                length += 1;
                res += (length + 1) / 2;
                used[i] = true;
            }
        }

        // insert 0 greedy
        int cntTemp = 0;
        for (int i = 0; i < n; i++) {
            if (used[i]) {
                cntTemp += 1;
            } else if (cntTemp % 2 == 1) {
                // add 0 if it is 2, 4, 6 th
                cntTemp += 1;
                length += 1;
                res += (length + 1) / 2;
                used[i] = true;
            }
        }

        int cntUnused = n - Arrays.stream(used).filter(b -> b).count();
        int switchCount = 0;
        // split by other 0
        int st = 0;
        int cnt1Even = 0;
        int cnt1Odd = 0;
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                int switched = (switchCount + 1) / 2;
                int nonSwitched = cntUnused - switched;
                res += cnt1Even * nonSwitched + cnt1Odd * switched;
                st = i + 1;
                switchCount += 1;
                cnt1Even = 0;
                cnt1Odd = 0;
            }
            if (t.charAt(i) == '1') {
                if ((i - st) % 2 == 0) {
                    cnt1Even += 1;
                } else {
                    cnt1Odd += 1;
                }
            }
        }

        // add last
        int switched = (switchCount + 1) / 2;
        int nonSwitched = cntUnused - switched;
        res += cnt1Even * nonSwitched + cnt1Odd * switched;

        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, calls the `solve` function, and prints the result. The `solve` function implements the logic of the Python code.<｜end▁of▁sentence｜>
