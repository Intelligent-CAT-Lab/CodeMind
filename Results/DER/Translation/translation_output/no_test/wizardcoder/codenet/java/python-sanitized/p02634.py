import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

class p02634:
    def __init__(self, in):
        tokens = in.readLine().split(" ")
        self.A = int(tokens[0])
        self.B = int(tokens[1])
        self.C = int(tokens[2])
        self.D = int(tokens[3])
        self.cell = [[0 for j in range(D)] for i in range(C)]
        self.cell[A - 1][B - 1] = 1
        for i in range(A, C):
            self.cell[i][B - 1] = self.cell[i - 1][B - 1] * B % MOD
        for i in range(B, D):
            self.cell[A - 1][i] = self.cell[A - 1][i - 1] * A % MOD

    def calc(self):
        for i in range(A, C):
            for j in range(B, D):
                # ãã®ãã¹ãç½ã®å ´å: ä¾ãã°ï¼å·¦ã®ãã¿ã¼ã³ * ä¸ä¸åã®ãããããé»
                self.cell[i][j] = self.cell[i - 1][j] * j % MOD
                self.cell[i][j] += self.cell[i][j - 1] * i % MOD
                self.cell[i][j] %= MOD
                val = self.cell[i - 1][j - 1] * i % MOD
                val *= j % MOD
                val %= MOD
                self.cell[i][j] -= val
                self.cell[i][j] += MOD
                self.cell[i][j] %= MOD
                self.cell[i][j] += self.cell[i - 1][j]
                self.cell[i][j] %= MOD
                self.cell[i][j] += self.cell[i][j - 1]
                self.cell[i][j] %= MOD

    def showCell(self):
        for i in range(C):
            for j in range(D):
                print(self.cell[i][j], end=" ")
            print()

    def showResult(self):
        print(self.cell[C - 1][D - 1])
        # self.showCell()

if __name__ == '__main__':
    reader = InputStreamReader(System.in, StandardCharsets.UTF_8)
    in = BufferedReader(reader)
    ins = p02634(in)
    ins.calc()
    ins.showResult()