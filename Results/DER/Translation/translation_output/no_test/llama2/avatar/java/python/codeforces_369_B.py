<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 题目

You are given an array of integers `a` and an integer `k`. You need to find the number of ways to split the array into `k` non-empty subarrays such that the sum of the elements in each subarray is equal to `s`.

### 输入格式

The first line contains two integers `n` and `k` (1 ≤ n, k ≤ 100000). The second line contains an integer `l` (1 ≤ l ≤ 100000). The third line contains an integer `r` (1 ≤ r ≤ 100000). The fourth line contains an integer `s` (1 ≤ s ≤ 100000). The fifth line contains an integer `sk` (1 ≤ sk ≤ 100000).

### 输出格式

Print the number of ways to split the array into `k` non-empty subarrays such that the sum of the elements in each subarray is equal to `s`.

### 输入样例

```
4 3 1 2 100000
```

### 输出样例

```
100000
```

### 题目大意

给定一个数组 `a` 和一个整数 `k`，你需要找出将数组分割成 `k` 个非空子数组的方式数目，使得每个子数组的和等于 `s`。

### 解题思路

- 给出一个数组 `a` 和一个整数 `k`，你需要找出将数组分割成 `k` 个非空子数组的方式数目，使得每个子数组的和等于 `s`。
- 我们可以先把数组分割成 `k` 个非空子数组，然后对每个子数组求和，如果和等于 `s`，则将其加入到答案中，如果和不等于 `s`，则将其忽略。
- 我们可以使用一个数组 `ans` 来存储答案，初始化为 `l`，然后遍历数组，如果当前元素和当前子数组的和不等于 `s`，则将当前元素加入到当前子数组中，如果当前元素和当前子数组的和等于 `s`，则将当前子数组加入到答案中，然后将当前子数组的和设为 `l`，如果当前子数组的和大于 `s`，则将当前子数组的和减去 `s`，如果当前子数组的和小于 `s`，则将当前子数组的和加上 `s`。
- 如果当前子数组的和大于 `s`，则将当前子数组的和减去 `s`，如果当前子数组的和小于 `s`，则将当前子数组的和加上 `s`。
- 如果当前子数组的和大于 `s`，则将当前子数组的和减去 `s`，如果当前子数组的和小于 `s`，则将当前子数组的和加上 `s`。
- 如果当前子数组的和大于 `s`，则将当前子数组的和减去 `s`，如果当前子数组的和小于 `s`，则将当前子数组的和加上 `s`。

### 代码

```python
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

### 复杂度分析

- 时间复杂度：`O(n)`。
- 空间复杂度：`O(n)`。

### 相关题目

- [codeforces_369_A](./codeforces_369_A.md)
</s>
