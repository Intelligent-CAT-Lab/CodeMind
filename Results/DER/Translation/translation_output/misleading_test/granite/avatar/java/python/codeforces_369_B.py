System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1 1 1 1

Expected output:
-27

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
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    ([1, 1, 1, 1, 1, 1], -27),
    ([1, 1, 1, 1, 1, 2], -26),
    ([1, 1, 1, 1, 1, 3], -25),
    ([1, 1, 1, 1, 1, 4], -24),
    ([1, 1, 1, 1, 1, 5], -23),
    ([1, 1, 1, 1, 1, 6], -22),
    ([1, 1, 1, 1, 1, 7], -21),
    ([1, 1, 1, 1, 1, 8], -20),
    ([1, 1, 1, 1, 1, 9], -19),
    ([1, 1, 1, 1, 1, 10], -18),
    ([1, 1, 1, 1, 1, 11], -17),
    ([1, 1, 1, 1, 1, 12], -16),
    ([1, 1, 1, 1, 1, 13], -15),
    ([1, 1, 1, 1, 1, 14], -14),
    ([1, 1, 1, 1, 1, 15], -13),
    ([1, 1, 1, 1, 1, 16], -12),
    ([1, 1, 1, 1, 1, 17], -11),
    ([1, 1, 1, 1, 1, 18], -10),
    ([1, 1, 1, 1, 1, 19], -9),
    ([1, 1, 1, 1, 1, 20], -8),
    ([1, 1, 1, 1, 1, 21], -7),
    ([1, 1, 1, 1, 1, 22], -6),
    ([1, 1, 1, 1, 1, 23], -5),
    ([1, 1, 1, 1, 1, 24], -4),
    ([1, 1, 1, 1, 1, 25], -3),
    ([1, 1, 1, 1, 1, 26], -2),
    ([1, 1, 1, 1, 1, 27], -1),
    ([1, 1, 1, 1, 1, 28], 0),
    ([1, 1, 1, 1, 1, 29], 1),
    ([1, 1, 1, 1, 1, 30], 2),
    ([1, 1, 1, 1, 1, 31], 3),
    ([1, 1, 1, 1, 1, 32], 4),
    ([1, 1, 1, 1, 1, 33], 5),
    ([1, 1, 1, 1, 1, 34], 6),
    ([1, 1, 1, 1, 1, 35], 7),
    ([1, 1, 1, 1, 1, 36], 8),
    ([1, 1, 1, 1, 1, 37], 9),
    ([1, 1, 1, 1, 1, 38], 10),
    ([1, 1, 1, 1, 1, 39], 11),
    ([1, 1, 1, 1, 1, 40], 12),
    ([1, 1, 1, 1, 1, 41], 13),
    ([1, 1, 1, 1, 1, 42], 14),
    ([1, 1, 1, 1, 1, 43], 15),
    ([1, 1, 1, 1, 1, 44], 16),
    ([1, 1, 1, 1, 1, 45], 17),
    ([1, 1, 1, 1, 1, 46], 18),
    ([1, 1, 1, 1, 1, 47], 19),
    ([1, 1, 1, 1, 1, 48], 20),
    ([1, 1, 1, 1, 1, 49], 21),
    ([1, 1, 1, 1, 1, 50], 22),
    ([1, 1, 1, 1, 1, 51], 23),
    ([1, 1, 1, 1, 1, 52], 24),
    ([1, 1, 1, 1, 1, 53], 25),
    ([1, 1, 1, 1, 1, 54], 26),
    ([1, 1, 1, 1, 1, 55], 27),
    ([1, 1, 1, 1, 1, 56], 28),
    ([1, 1, 1, 1, 1, 57], 29),
    ([1, 1, 1, 1, 1, 58], 30),
    ([1, 1, 1, 1, 1, 59], 31),
    ([1, 1, 1, 1, 1, 60], 32),
    ([1, 1, 1, 1, 1, 61], 33),
    ([1, 1, 1, 1, 1, 62], 34),
    ([1, 1, 1, 1, 1, 63], 35),
    ([1, 1, 1, 1, 1, 64], 36),
    ([1, 1, 1, 1, 1, 65], 37),
    ([1, 1, 1, 1, 1, 66], 38),
    ([1, 1, 1, 1, 1, 67], 39),
    ([1, 1, 1, 1, 1, 68], 40),
    ([1, 1, 1, 1, 1, 69], 41),
    ([1, 1, 1, 1, 1, 70], 42),
    ([1, 1, 1, 1, 1, 71], 43),
    ([1, 1, 1, 1, 1, 72], 44),
    ([1, 1, 1, 1, 1, 73], 45),
    ([1, 1, 1, 1, 1, 74], 46),
    ([1, 1, 1, 1, 1, 75], 47),
    ([1, 1, 1, 1, 1, 76], 48),
    ([1, 1, 1, 1, 1, 77], 49),
    ([1, 1, 1, 1, 1, 78], 50),
    ([1, 1, 1, 1, 1, 79], 51),
    ([1, 1
