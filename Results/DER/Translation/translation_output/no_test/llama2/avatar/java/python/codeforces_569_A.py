<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;
import java.math.*;

public class codeforces_569_A {
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
            int t = in.nextInt();
            int s = in.nextInt();
            int q = in.nextInt();
            long sum = 0;
            while (s < t) {
                s = s * q;
                sum++;
            }
            out.println(sum);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    return false;
                }
            }
            return true;
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

        public String nextLine() {
            String str = null;
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }

        public BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}
```

### 题目

给定一个正整数 $t$，求从 $1$ 到 $t$ 之间所有的整数之和。

### 输入格式

第一行包含一个整数 $t$，表示需要求和的整数个数。

### 输出格式

输出一个整数，表示所有整数之和。

### 输入样例

```
4
1000000000
```

### 输出样例

```
1000000000
```

### 输入解释

第一行输入 $t = 4$，表示需要求和的整数个数为 $4$。

第二行输入 $s = 1000000000$，表示需要求和的整数为 $1000000000$。

### 输出解释

输出 $1000000000$，表示所有整数之和为 $1000000000$。

### 提示

- $1 \leq t \leq 10^5$
- $1 \leq s \leq 10^18$

### 相关题目

- [codeforces_569_B](codeforces_569_B.md)
</s>
