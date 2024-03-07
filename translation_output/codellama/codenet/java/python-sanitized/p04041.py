import java.io.*;
import java.util.*;
import java.math.*;
# import java.awt.Point;

class p04041:
    is = None
    out = None
    INPUT = ""

    MOD = 1_000_000_007
    inf = int(Integer.MAX_VALUE/2)

    def solve(self):
        n = self.ni()
        x = self.ni()
        y = self.ni()
        z = self.ni()
        sum = x + y + z + 1
        mask = 1 << sum
        mask -= 1
        dp = [[0] * (mask + 1) for _ in range(n + 1)]
        ng = 0
        ng |= 1 << z
        ng |= 1 << (y + z)
        ng |= 1 << (x + y + z)
        dp[0][1] = 1
        for i in range(n):
            for state in range(mask + 1):
                for j in range(1, 11):
                    res = (state << j) & mask + 1
                    if (res & ng) == ng:
                        continue
                    dp[i + 1][res] += dp[i][state]
                    dp[i + 1][res] %= self.MOD
        ans = 1
        for i in range(n):
            ans *= 10
            ans %= self.MOD
        for state in range(mask + 1):
            ans -= dp[n][state]
            ans %= self.MOD
        self.out.println((ans + self.MOD) % self.MOD)

    def run(self):
        self.is = self.INPUT.isEmpty() and System.in or ByteArrayInputStream(self.INPUT.getBytes())
        self.out = PrintWriter(System.out)
        s = System.currentTimeMillis()
        self.solve()
        self.out.flush()
        if not self.INPUT.isEmpty():
            tr(System.currentTimeMillis() - s