<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

def get_points(n, k, l, r, s_all, s_k):
    ans = [l] * n
    s_all -= s_k + (n - k) * l
    s_k -= k * l
    while s_k > 0:
        idx = n - 1
        while s_k > 0 and idx >= n - k:
            ans[idx] += 1
            s_k -= 1
            idx -= 1
    while s_all > 0:
        idx = 0
        while s_all > 0 and idx < n - k:
            ans[idx] += 1
            s_all -= 1
            idx += 1
    return ans

if __name__ == "__main__":
    n, k, l, r, s_all, s_k = map(int, sys.stdin.readline().split())
    ans = get_points(n, k, l, r, s_all, s_k)
    for num in ans:
        print(num, end=" ")
```
This is the Python code for the given Java code. The `get_points` function is the same as the `getPoints` function in the Java code, and it takes the same arguments. The `if __name__ == "__main__":` block is used to run the code only when the file is executed directly, and it reads the input from `sys.stdin` and calls the `get_points` function with the input arguments. The output is printed to the console using `print`.</s>
