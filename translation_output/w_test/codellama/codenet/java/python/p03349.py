<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2 100

Expected output:
5


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
 * @author kessido
 */
public class p03349 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ESequenceGrowingHard solver = new ESequenceGrowingHard();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESequenceGrowingHard {
        private long MOD;
        private int k;
        private int n;
        private long[][] numberOfSequencesOfSizeIwithElementBiggerThenJ = new long[301][301];
        private long[][] sumValue = new long[301][301];
        private long[][] nChK = new long[301][301];

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.NextInt();
            k = in.NextInt();
            MOD = in.NextLong();
            nChK = MathExtentions.preComputeNChooseK_MOD_Mod(n, MOD);
            for (int j = k; j >= 0; j--) {
                numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j] = 1 % MOD;
                numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j] = (k - j) % MOD;
            }
            sumValue[0][k] = 1;
            sumValue[1][k] = 0;

            for (int j = k - 1; j >= 0; j--) {
                sumValue[0][j] = (sumValue[0][j + 1] + numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j]) % MOD;
                sumValue[1][j] = (sumValue[1][j + 1] + numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j]) % MOD;
            }

            for (int i = 2; i <= n; i++) {
                for (int j = k - 1; j >= 0; j--) {
                    long res = 0;
                    for (int sizeToTheLeft = 0; sizeToTheLeft < i; sizeToTheLeft++) {
                        long optionLeft = sumValue[sizeToTheLeft][j + 1];
                        long optionRight = numberOfSequencesOfSizeIwithElementBiggerThenJ[i - 1 - sizeToTheLeft][j];
                        long optionToAddToEachSide = nChK[i - 1][sizeToTheLeft];
                        res = (res + ((((optionLeft * optionRight) % MOD) * optionToAddToEachSide) % MOD)) % MOD;
                    }
                    numberOfSequencesOfSizeIwithElementBiggerThenJ[i][j] = res;
                    sumValue[i][j] = (sumValue[i][j + 1] + res) % MOD;
                }
            }
            out.println(numberOfSequencesOfSizeIwithElementBiggerThenJ[n][0]);
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

        public long NextLong() {
            return Long.parseLong(next());
        }

    }

    static class MathExtentions {
        public static long[][] preComputeNChooseK_MOD_Mod(final int maxn, final long MOD) {
            long[][] res = new long[maxn + 1][];
            for (int i = 0; i <= maxn; i++) {
                res[i] = new long[i + 1];
                res[i][0] = 1;
                res[i][i] = 1;
            }
            for (int i = 2; i < maxn; i++) {
                for (int j = 1; j <= i >> 1; j++) {
                    final long ress = (res[i - 1][j] + res[i - 1][j - 1]) % MOD;
                    res[i][j] = ress;
                    res[i][i - j] = ress;
                }
            }
            return res;
        }

    }
}


```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class ESequenceGrowingHard:
    def __init__(self, n, k, MOD):
        self.n = n
        self.k = k
        self.MOD = MOD
        self.numberOfSequencesOfSizeIwithElementBiggerThenJ = [[0] * (k + 1) for _ in range(n + 1)]
        self.sumValue = [[0] * (k + 1) for _ in range(n + 1)]
        self.nChK = [[0] * (n + 1) for _ in range(n + 1)]

    def solve(self):
        self.nChK = preComputeNChooseK_MOD_Mod(self.n, self.MOD)
        for j in range(self.k, -1, -1):
            self.numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j] = 1 % self.MOD
            self.numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j] = (self.k - j) % self.MOD
        self.sumValue[0][self.k] = 1
        self.sumValue[1][self.k] = 0

        for j in range(self.k - 1, -1, -1):
            self.sumValue[0][j] = (self.sumValue[0][j + 1] + self.numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j]) % self.MOD
            self.sumValue[1][j] = (self.sumValue[1][j + 1] + self.numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j]) % self.MOD

        for i in range(2, self.n + 1):
            for j in range(self.k - 1, -1, -1):
                res = 0
                for sizeToTheLeft in range(i):
                    optionLeft = self.sumValue[sizeToTheLeft][j + 1]
                    optionRight = self.numberOfSequencesOfSizeIwithElementBiggerThenJ[i - 1 - sizeToTheLeft][j]
                    optionToAddToEachSide = self.nChK[i - 1][sizeToTheLeft]
                    res = (res + ((((optionLeft * optionRight) % self.MOD) * optionToAddToEachSide) % self.MOD))
