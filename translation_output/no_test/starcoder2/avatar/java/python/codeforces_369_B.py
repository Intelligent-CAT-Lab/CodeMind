
```
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

n, k, l, r, sAll, sk = map(int, sys.stdin.readline().split())
ans = getPoints(n, k, l, r, sAll, sk)
print(' '.join(map(str, ans)))
```

## 369B - Valera and Plates

### 题目大意

给定一个数组，数组中有n个元素，每个元素有两个值，分别是a和b，现在要从数组中选出k个元素，使得选出的元素的a值之和等于b值之和，求出选出的元素的下标。

### 解题思路

贪心，先将数组按照a值从小到大排序，然后从小到大遍历数组，如果当前元素的a值小于b值，则将当前元素加入结果集，否则跳过当前元素。

### 代码

```
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        int[] ans = getIndices(n, k, a, b);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] getIndices(int n, int k, int[] a, int[] b) {
        int[] ans = new int[k];
        int idx = 0;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                ans[idx++] = i + 1;
                if (idx == k) {
                    break;
                }
            }
        }
        return ans;
    }
}
```

## 369C - Valera and Elections

### 题目大意

给定一个数组，数组中有n个元素，每个元素有两个值，分别是a和b，现在要从数组中选出k个元素，使得选出的元素的a值之和等于b值之和，求出选出的元素的下标。

### 解题思路

贪心，先将数组按照a值从小到大排序，然后从小到大遍历数组，如果当前元素的a值小于b值，则将当前元素加入结果集，否则跳过当前元素。

### 代码

```
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_369_C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        int[] ans = getIndices(n, k, a, b);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] getIndices(int n, int k, int[] a, int[] b) {
        int[] ans = new int[k];
        int idx = 0;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                ans[idx++] = i + 1;
                if (idx == k) {
                    break;
                }
            }
        }
        return ans;
    }
}
```
 1; i < n; i++) {
            if (a[i] < b[i]) {
                ans[idx++] = i + 1;
                if (idx == k) {
                    break;
                }
            }
        }
        return ans;
    }
}
```

## 369C - Valera and Elections

### 题目大意

给定一个数组，数组中有n个元素，每个元素有两个值，分别是a和b，现在要从数组中选出k个元素，使得选出的元素的a值之和等于b值之和，求出选出的元素的下标。

### 解题思路

贪心，先将数组按照a值从小到大排序，然后从小到大遍历数组，如果当前元素的a值小于b值，则将当前元素加入结果集，否则跳过当前元素。

### 代码

```
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_369_C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        int[] ans = getIndices(n, k, a, b);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] getIndices(int n, int k, int[] a, int[] b) {
        int[] ans = new int[k];
        int idx = 0;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                ans[idx++] = i + 1;
                if (idx == k) {
                    break;
                }
            }
        }
        return ans;
    }
}
```
/codeforces/codeforces_369.md
# codeforces 369

## 369A - Valera and Antique Items

### 题目大意

给定一个数组，数组中有n个元素，每个元素有两个值，分别是a和b，现在要从数组中选出k个元素，使得选出的元素的a值之和等于b值之和，求出选出的元素的下标。

### 解题思路

贪心，先将数组按照a值从小到大排序，然后从小到大遍历
