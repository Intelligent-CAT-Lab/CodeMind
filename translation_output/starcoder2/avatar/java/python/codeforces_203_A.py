
```
import sys

points = int(sys.stdin.readline())
t = int(sys.stdin.readline())
a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
ta = int(sys.stdin.readline())
tb = int(sys.stdin.readline())

for i in range(t):
    for j in range(t):
        if points == a - i * ta + b - j * tb or (points == 0) or points == a - ta * i or points == b - tb * j:
            print("YES")
            sys.exit(0)
print("NO")
```


```

python code:
```
import sys

n = int(sys.stdin.readline())

for i in range(n):
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    if a + b == c:
        print("YES")
    else:
        print("NO")
```
/codeforces/203_A.md
# A. Two Problems

## Problem

You are given a set of problems. Each problem has its own difficulty. You have to solve exactly two problems. You have to solve the problems in such a way that the sum of difficulties of the problems you solve is equal to the given number.

## Input

The first line contains the number of problems n (1 ≤ n ≤ 100). Each of the next n lines contains three integers ai, bi, ci (1 ≤ ai, bi, ci ≤ 100) — the difficulty of the i-th problem, the number of problems you have to solve with difficulty ai and the number of problems you have to solve with difficulty bi.

## Output

For each problem print "YES" if you can solve it and "NO" otherwise.

## Examples

input
```
3
1 2 3
2 3 4
3 4 5
```

output
```
YES
NO
YES
```

## Note

In the first test case you can solve the first problem with difficulty 1 and the second problem with difficulty 2.

In the second test case you can't solve any problem.

In the third test case you can solve the first problem with difficulty 3 and the second problem with difficulty 4.

## Solution

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

public class codeforces_203_A {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ATwoProblems solver = new ATwoProblems();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATwoProblems {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                if (a + b == c) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
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
}/codeforces/203_B.md
# B. Two Tables

## Problem

You are given two tables. The first table is a rectangle of size n × m. The second table is a rectangle of size n × m. Each cell of the first table contains a lowercase English letter. Each cell of the second table contains a digit from 0 to 9.

You have to place the second table on the first table in such a way that the sum of the digits in the cells of the second table that are placed on the cells of the first table is maximum possible.

## Input

The first line contains two integers n and m (1 ≤ n, m ≤ 100). Each of the next n lines contains m lowercase English letters — the description of the first table. Each of the next n lines contains m digits — the description of the second table.

## Output

Print the only integer — the maximum possible sum of the digits in the cells of the second table that are placed on the cells of the first table.

## Examples

input
```
2 2
ab
cd
12
34
```

output
```
10
```

input
```
2 2
ab
cd
10
10
```

output
```
20
```

## Note

In the first sample you can place the second table on the first table in such a way that the sum of the digits in the cells of the second table that are placed on the cells of the first table is equal to 10.

In the second sample you can place the second table on the first table in such a way that the sum of the digits in the cells of the second table that are placed on the cells of the first table is equal to 20.

## Solution

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

public class codeforces_203_B {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BTwoTables solver = new BTwoTables();
        solver
