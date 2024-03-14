<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class p02634 {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		p02634 ins = new p02634(in);
		ins.calc();
		ins.showResult();
	}

	int A, B, C, D;
	long MOD = 998244353L;
	long[][] cell;

	p02634(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		A = Integer.parseInt(tokens[0]);
		B = Integer.parseInt(tokens[1]);
		C = Integer.parseInt(tokens[2]);
		D = Integer.parseInt(tokens[3]);
		cell = new long[C][D];
		for (int i = 0; i < C; ++i) {
			Arrays.fill(cell[i], 0L);
		}
		cell[A - 1][B - 1] = 1L;
		for (int i = A; i < C; ++i) {
			cell[i][B - 1] = cell[i - 1][B - 1] * B % MOD;
		}
		for (int i = B; i < D; ++i) {
			cell[A - 1][i] = cell[A - 1][i - 1] * A % MOD;
		}
	}

	void calc() {
		for (int i = A; i < C; ++i) {
			for (int j = B; j < D; ++j) {
				// ãã®ãã¹ãç½ã®å ´å: ä¾ãã°ï¼å·¦ã®ãã¿ã¼ã³ * ä¸ä¸åã®ãããããé»
				cell[i][j] = cell[i - 1][j] * (long) j;
				cell[i][j] %= MOD;
				cell[i][j] += cell[i][j - 1] * (long) i;
				cell[i][j] %= MOD;
				long val = cell[i - 1][j - 1] * (long) i;
				val %= MOD;
				val *= (long) j;
				val %= MOD;
				cell[i][j] -= val;
				cell[i][j] += MOD;
				cell[i][j] %= MOD;
				cell[i][j] += cell[i - 1][j];
				cell[i][j] %= MOD;
				cell[i][j] += cell[i][j - 1];
				cell[i][j] %= MOD;
			}
		}
	}

	void showCell() {
		for (int i = 0; i < C; ++i) {
			for (int j = 0; j < D; ++j) {
				System.out.print(cell[i][j] + " ");
			}
			System.out.println("");
		}
	}

	void showResult() {
		System.out.println(cell[C - 1][D - 1]);
		// showCell();
	}
}
```

### Response:
```python
import sys

class p02634:
    def __init__(self):
        A, B, C, D = map(int, sys.stdin.readline().split())
        self.A, self.B, self.C, self.D = A, B, C, D
        self.MOD = 998244353
        self.cell = [[0]*D for _ in range(C)]
        self.cell[A - 1][B - 1] = 1
        for i in range(A, C):
            self.cell[i][B - 1] = self.cell[i - 1][B - 1] * B % self.MOD
        for i in range(B, D):
            self.cell[A - 1][i] = self.cell[A - 1][i - 1] * A % self.MOD

    def calc(self):
        for i in range(self.A, self.C):
            for j in range(self.B, self.D):
                self.cell[i][j] = self.cell[i - 1][j] * j % self.MOD
                self.cell[i][j] += self.cell[i][j - 1] * i % self.MOD
                val = self.cell[i - 1][j - 1] * i % self.MOD
                val *= j
                val %= self.MOD
                self.cell[i][j] -= val
                self.cell[i][j] %= self.MOD
                self.cell[i][j] += self.cell[i - 1][j]
                self.cell[i][j] %= self.MOD
                self.cell[i][j] += self.cell[i][j - 1]
                self.cell[i][j] %= self.MOD

    def show_cell(self):
        for i in range(self.C):
            for j in range(self.D):
                print(self.cell[i][j], end=" ")
            print("")

    def show_result(self):
        print(self.cell[self.C - 1][self.D - 1])
        # self.show_cell()

if __name__ == "__main__":
    ins = p02634()
    ins.calc()
    ins.show_result()
```
<|EOT|>
