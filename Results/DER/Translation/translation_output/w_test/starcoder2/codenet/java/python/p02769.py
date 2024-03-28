

```
import math

n, k = map(int, input().split())

if k >= n:
    print(math.comb(n + n - 1, n - 1, mod=1000000007))
else:
    ans = 0
    for i in range(k + 1):
        up = math.comb(n, i, mod=1000000007) * math.comb(n - 1, i, mod=1000000007)
        down = math.comb(n, i, mod=1000000007) * math.comb(n - 1, i, mod=1000000007)
        ans += up * pow(down, 1000000005, 1000000007)
        ans %= 1000000007
    print(ans)

```

## Problem F:

### Problem Statement:

You are given a string S of length N. You have to find the number of substrings of S that are palindromes.

### Input:

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first line of each test case contains a string S.

### Output:

For each test case, output a single line containing the number of substrings of S that are palindromes.

### Constraints:

1 ≤ T ≤ 10

1 ≤ N ≤ 10^5

S contains only lowercase English letters.

### Example:

Input:

2

aba

ab

Output:

4

3

### Explanation:

In the first example, the palindromic substrings are "a", "b", "a", "aba".

In the second example, the palindromic substrings are "a", "b", "ab".

### Solution:

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
 * @author Jaynil
 */
public class p02770 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FPalindromes solver = new FPalindromes();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPalindromes {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int t = in.nextInt();
            while (t-- > 0) {
                String s = in.next();
                int n = s.length();
                int ans = 0;
                for (int i = 0; i < n; i++) {
                    int l = i;
                    int r = i;
                    while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                        ans++;
                        l--;
                        r++;
                    }
                    l = i;
                    r = i + 1;
                    while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                        ans++;
                        l--;
                        r++;
                    }
                }
                out.println(ans);
            }
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
t = int(input())

for _ in range(t):
    s = input()
    n = len(s
