

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        int[] g = new int[s.length() + 1];
        boolean[] b = new boolean[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '_') {
                cnt += 0;
            } else if (c == '/') {
                cnt += 1;
            } else if (c == '\\') {
                cnt -= 1;
            }
            g[i + 1] = cnt;
        }
        int gmax = g[0];
        for (int i = 1; i < g.length; i++) {
            if (g[i - 1] < g[i] && g[i] <= gmax) {
                b[i] = true;
            }
            gmax = Math.max(gmax, g[i]);
        }
        int[] puddles = new int[s.length()];
        int volume = 0;
        int saface_level = -1;
        for (int i = g.length - 1; i >= 0; i--) {
            if (saface_level != -1) {
                volume += saface_level - g[i];
                if (saface_level == g[i]) {
                    puddles[i] = volume;
                    saface_level = -1;
                    volume = 0;
                }
            }
            if (saface_level == -1 && b[i]) {
                saface_level = g[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < puddles.length; i++) {
            sum += puddles[i];
        }
        System.out.println(sum);
        int count = 0;
        for (int i = 0; i < puddles.length; i++) {
            if (puddles[i] != 0) {
                count++;
            }
        }
        System.out.print(count);
        for (int i = 0; i < puddles.length; i++) {
            if (puddles[i] != 0) {
                System.out.print(" " + puddles[i]);
            }
        }
    }
}
```

## 2. 2019-2020 ACM-ICPC, Asia Daejeon Regional Contest, Problem B

### Description

You are given a string $s$ of length $n$ consisting of lowercase English letters.

You can perform the following operation any number of times (possibly zero):

- Choose two indices $i$ and $j$ ($1 \le i < j \le n$) such that $s_i = s_j$ and $s_{i+1} \ne s_{j+1}$.
- Remove the characters $s_i$ and $s_j$ from $s$.

For example, if $s = \texttt{abacaba}$, then we can remove the characters $\texttt{a}$ and $\texttt{a}$ to obtain the string $\texttt{bcb}$, or we can remove the characters $\texttt{a}$ and $\texttt{a}$ to obtain the string $\texttt{bcba}$.

Your task is to find the lexicographically smallest string that can be obtained by performing the operation any number of times (possibly zero) on $s$.

### Input

The first line contains a single integer $t$ ($1 \le t \le 1000$) — the number of test cases.

The first and only line of each test case contains a string $s$ ($1 \le |s| \le 1000$) consisting of lowercase English letters.

### Output

For each test case, print the lexicographically smallest string that can be obtained by performing the operation any number of times (possibly zero) on $s$.

### Sample Input

```
3
abacaba
a
abacaba
```

### Sample Output

```
acaba
a
acaba
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if (j == 0) {
                    sb.append(s.charAt(j));
                } else {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        sb.append(s.charAt(j));
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
```

## 3. 2019-2020 ACM-ICPC, Asia Daejeon Regional Contest, Problem C

### Description

You are given a string $s$ of length $n$ consisting of lowercase English letters.

You can perform the following operation any number of times (possibly zero):

- Choose two indices $i$ and $j$ ($1 \le i < j \le n$) such that $s_i = s_j$ and $s_{i+1} \ne s_{j+1}$.
- Remove the characters $s_i$ and $s_j$ from $s$.

For example, if $s = \texttt{abacaba}$, then we can remove the characters $\texttt{a}$ and $\texttt{a}$ to obtain the string $\texttt{bcb}$, or we can remove the characters $\texttt{a}$ and $\texttt{a}$ to obtain the string $\texttt{bcba}$.

Your task is to find the lexicographically smallest string that can be obtained by performing the operation any number of times (possibly zero) on $s$.

### Input

The first line contains a single integer $t$ ($1 \le t \le 1000$) — the number of test cases.

The first and only line of each test case contains a string $s$ ($1 \le |s| \le 1000$) consisting of lowercase English letters.

### Output

For each test case, print the lexicographically smallest string that can be obtained by performing the operation any number of times (possibly zero) on $s$.

### Sample Input

```
3
abacaba
a
abacaba
```

### Sample Output

```
acaba
a
acaba
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if (j == 0) {
                    sb.append(s.charAt(j));
                } else {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        sb.append(s
