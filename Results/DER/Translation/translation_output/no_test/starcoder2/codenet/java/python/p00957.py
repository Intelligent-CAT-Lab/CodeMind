
```
import sys

l, k = map(int, sys.stdin.readline().split())
dp = [[0 for i in range(l+1)] for j in range(2)]
dp[0][0] = 1
for i in range(1, l+1):
    dp[0][i] += dp[1][i-1]
    dp[1][i] += dp[0][i-1]
    if i >= k:
        dp[1][i] += dp[0][i-k]
ans = 0
for i in range(1, l+1):
    ans += dp[1][i]
print(ans)
```

## 00958

### 题目

[题目链接](https://vjudge.net/problem/CodeForces-958A1)

### 题意

给出一个长度为n的字符串，问是否存在一个长度为k的子串，使得这个子串的每个字符都在这个子串的第一个字符和最后一个字符之间。

### 思路

直接暴力枚举子串的起点和终点，然后判断是否满足条件即可。

### 代码

java code:
```
import java.io.*;
import java.util.*;

public class p00958 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        String s = sc.nextLine();
        int n = s.length();
        int k = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n - k + 1; ++i) {
            for (int j = i + k - 1; j < n; ++j) {
                if (s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        if (flag)
            out.println("YES");
        else
            out.println("NO");
        out.close();
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```

python code:
```
import sys

s = sys.stdin.readline().strip()
n = len(s)
k = int(sys.stdin.readline())
flag = False
for i in range(n-k+1):
    for j in range(i+k-1, n):
        if s[i] == s[j]:
            flag = True
            break
    if flag:
        break
if flag:
    print("YES")
else:
    print("NO")
```

## 00959

### 题目

[题目链接](https://vjudge.net/problem/CodeForces-959A)

### 题意

给出一个整数n，问n是否为偶数。

### 思路

直接判断n是否为偶数即可。

### 代码

java code:
```
import java.io.*;
import java.util.*;

public class p00959 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        if (n % 2 == 0)
            out.println("Mahmoud");
        else
            out.println("Ehab");
        out.close();
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```

python code:
```
import sys

n = int(sys.stdin.readline())
if n % 2 == 0:
    print("Mahmoud")
else:
    print("Ehab")
```

## 00960

### 题目

[题目链接](https://vjudge.net/problem/CodeForces-960A)

### 题意

给出一个长度为n的字符串，问是否存在一个长度为3的子串，使得这个子串的每个字符都在这个子串的第一个字符和最后一个字符之间。

### 思路

直接暴力枚举子串的起点和终点，然后判断是否满足条件即可。

### 代码

java code:
```
import java.io.*;
import java.util.*;

public class p00960 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        String s = sc.nextLine();
        int n = s.length();
        boolean flag = false;
        for (int i = 0; i < n - 2; ++i) {
            for (int j = i + 2; j < n; ++j) {
                if (s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        if (flag)
            out.println("Yes");
        else
            out.
