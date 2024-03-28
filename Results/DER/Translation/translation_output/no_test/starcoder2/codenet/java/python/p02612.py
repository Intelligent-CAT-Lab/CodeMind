
```
n = int(input())
x = n // 1000
y = n % 1000
if y == 0:
    print(0)
else:
    ans = 1000 * (x + 1) - n
    print(ans)
```

## 2613 - A and B and Interesting Substrings

### 题目大意

给定一个字符串，求有多少个子串满足子串中A的个数大于等于B的个数。

### 解题思路

用一个数组记录前缀和，然后遍历一遍，对于每个位置，求出以这个位置结尾的满足条件的子串个数，然后累加起来即可。

### 代码

java code:
```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author shivam
 */
public class p02613 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            int n = s.length();
            int[] pre = new int[n + 1];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'A') pre[i + 1] = pre[i] + 1;
                else pre[i + 1] = pre[i] - 1;
            }
            long ans = 0;
            for (int i = 0; i <= n; i++) {
                if (pre[i] >= 0) ans += i;
            }
            out.println(ans);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


```

python code:
```
s = input()
n = len(s)
pre = [0] * (n + 1)
for i in range(n):
    if s[i] == 'A':
        pre[i + 1] = pre[i] + 1
    else:
        pre[i + 1] = pre[i] - 1
ans = 0
for i in range(n + 1):
    if pre[i] >= 0:
        ans += i
print(ans)
```

## 2614 - A and B and Team Training

### 题目大意

给定一个数组，求有多少个区间满足区间中最大值和最小值的差不超过k。

### 解题思路

用一个数组记录前缀最大值，然后遍历一遍，对于每个位置，求出以这个位置结尾的满足条件的区间个数，然后累加起来即可。

### 代码

java code:
```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author shivam
 */
public class p02614 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] pre = new int[n + 1];
            for (int i = 0; i < n; i++) {
                pre[i + 1] = Math.max(pre[i], a[i]);
            }
            long ans = 0;
            for (int i = 0; i <= n; i++) {
                int l = i, r = n;
                while (l < r) {
                    int mid = (l + r + 1) / 2;
                    if (pre[mid] - pre[i] <= k) l = mid;
                    else r = mid - 1;
                }
                ans += n - l + 1;
            }
            out.println(ans);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


```

python code:
```
n, k = map(int, input().split())
a = list(map(int, input().split()))
pre = [0] * (n + 1)
for i in range(n):
    pre[i + 1] = max(pre[i], a[i])
ans = 0
for i in range(n + 1):
    l = i
    r = n
    while l < r:
        mid = (l + r + 1) // 2
       
