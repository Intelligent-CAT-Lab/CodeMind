

```python
import sys

def solve(c):
    if c == 0:
        if check():
            return 1
        else:
            return 0

    ret = 0
    for i in range(4):
        for j in range(3):
            if nums[i][j] == -1:
                for k in range(1, 10):
                    if not used[k]:
                        nums[i][j] = k
                        used[k] = True
                        ret += solve(c - 1)
                        nums[i][j] = -1
                        used[k] = False
                return ret

def check():
    a = [0] * 4
    for i in range(4):
        a[i] = nums[i][0] * 100 + nums[i][1] * 10 + nums[i][2]
    return a[0] + a[1] + a[2] == a[3]

nums = [[0] * 3 for _ in range(4)]
used = [False] * 10

words = sys.stdin.readline().split()
count = 0
for i in range(4):
    for j in range(3):
        n = int(words[i * 3 + j])
        if n != -1:
            used[n] = True
        else:
            count += 1
        nums[i][j] = n

print(solve(count))
```

## 00323 - 1, 2, 3, 4

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
1


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * 1, 2, 3, 4
 */
public class p00323 {

    static int[] nums;
    static boolean[] used;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] words;

        words = br.readLine().split(" ");

        nums = new int[4];
        used = new boolean[5];

        for (int i = 0; i < words.length; i++) {
            int n = parseInt(words[i]);
            nums[i] = n;
            used[n] = true;
        }

        System.out.println(solve());
    }

    static int solve() {

        int ret = 0;

        for (int i = 1; i <= 4; i++) {
            if (!used[i]) {
                nums[0] = i;
                used[i] = true;
                ret += solve(1);
                used[i] = false;
            }
        }

        return ret;
    }

    static int solve(int c) {

        if (c == 4) {
            if (check()) return 1;
            else return 0;
        }

        int ret = 0;

        for (int i = 1; i <= 4; i++) {
            if (!used[i]) {
                nums[c] = i;
                used[i] = true;
                ret += solve(c + 1);
                used[i] = false;
            }
        }

        return ret;
    }

    static boolean check() {
        return nums[0] + nums[1] == nums[2] && nums[1] + nums[2] == nums[3];
    }
}
```

python code:

```python
import sys

def solve():
    ret = 0
    for i in range(1, 5):
        if not used[i]:
            nums[0] = i
            used[i] = True
            ret += solve(1)
            used[i] = False
    return ret

def solve(c):
    if c == 4:
        if check():
            return 1
        else:
            return 0

    ret = 0
    for i in range(1, 5):
        if not used[i]:
            nums[c] = i
            used[i] = True
            ret += solve(c + 1)
            used[i] = False
    return ret

def check():
    return nums[0] + nums[1] == nums[2] and nums[1] + nums[2] == nums[3]

nums = [0] * 4
used = [False] * 5

words = sys.stdin.readline().split()
for i in range(4):
    n = int(words[i])
    nums[i] = n
    used[n] = True

print(solve())
```

## 00324 - 1, 2, 3, 4, 5

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * 1, 2, 3, 4, 5
 */
public class p00324 {

    static int[] nums;
    static boolean[] used;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] words;

        words = br.readLine().split(" ");

        nums
