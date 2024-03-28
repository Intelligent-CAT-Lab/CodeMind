<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def getPoints(n, k, l, r, sAll, sk):
    ans = [l] * n
    sAll -= sk + (n - k) * l
    sk -= k * l
    while sk > 0:
        idx = n - 1
        while sk > 0 and idx >= n - k:
            ans[idx] += 1
            sk -= 1
            idx -= 1
    while sAll > 0:
        idx = 0
        while sAll > 0 and idx < n - k:
            ans[idx] += 1
            sAll -= 1
            idx += 1
    return ans

if __name__ == "__main__":
    n, k, l, r, sAll, sk = map(int, sys.stdin.readline().split())
    ans = getPoints(n, k, l, r, sAll, sk)
    for num in ans:
        print(num, end=' ')
```

'''
<|endoftext|>
