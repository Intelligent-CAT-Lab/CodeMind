System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1 1 1 1

Expected output:
1 

```
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int r = scan.nextInt();
        int sAll = scan.nextInt();
        int sk = scan.nextInt();
        int[] ans = getPoints(n, k, l, r, sAll, sk);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] getPoints(int n, int k, int l, int r, int sAll, int sk) {
        int[] ans = new int[n];
        Arrays.fill(ans, l);
        sAll -= sk + (n - k) * l;
        sk -= k * l;
        while (sk > 0) {
            int idx = n - 1;
            while (sk > 0 && idx >= n - k) {
                ans[idx--]++;
                sk--;
            }
        }
        while (sAll > 0) {
            int idx = 0;
            while (sAll > 0 && idx < n - k) {
                ans[idx++]++;
                sAll--;
            }
        }
        return ans;
    }
}
```


Answer:
```python
import sys

def get_points(n, k, l, r, s_all, sk):
    ans = [l] * n
    s_all -= sk + (n - k) * l
    sk -= k * l
    while sk > 0:
        idx = n - 1
        while sk > 0 and idx >= n - k:
            ans[idx] += 1
            sk -= 1
            idx -= 1
    while s_all > 0:
        idx = 0
        while s_all > 0 and idx < n - k:
            ans[idx] += 1
            s_all -= 1
            idx += 1
    return ans

def main():
    n, k, l, r, s_all, sk = map(int, sys.stdin.readline().split())
    ans = get_points(n, k, l, r, s_all, sk)
    print(" ".join(map(str, ans)))

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    (1, 1, 1, 1, 1, 1, [1]),
    (5, 2, 1, 2, 4, 3, [1, 1, 2, 2, 2]),
    (5, 2, 1, 2, 3, 2, [1, 1, 2, 2, 1]),
    (5, 3, 1, 2, 5, 5, [2, 2, 2, 1, 1]),
]
for n, k, l, r, s_all, sk, expected_output in test_cases:
    assert get_points(n, k, l, r, s_all, sk) == expected_output
```<|endoftext|>
