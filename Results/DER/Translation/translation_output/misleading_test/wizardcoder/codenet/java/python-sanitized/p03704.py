import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.util.Arrays
import java.util.InputMismatchException

class p03704:
    is = None
    out = None
    INPUT = ""

    def solve(self):
        D = self.nl()
        ans = 0
        for len in range(Long.toString(D).length(), 19):
            res = self.dfs(D, 0, len)
            ans += res
        self.out.println(ans)

    def dfs(self, rem, pos, len):
        if len - pos - 1 < pos:
            return 1 if rem == 0 else 0
        if pos == len - 1 - pos:
            return 10 if rem == 0 else 0

        d = 1
        for i in range(1, len - pos - 1 + 1):
            d *= 10
        dm = 1
        for i in range(1, pos + 1):
            dm *= 10
        d -= dm
        if abs(rem) >= 10 * d:
            return 0

        ret = 0
        for i in range(-9, 10):
            if pos == 0 and i >= 0:
                ret += self.dfs(rem - d * i, pos + 1, len) * (9 - abs(i))
            else:
                ret += self.dfs(rem - d * i, pos + 1, len) * (10 - abs(i))
        return ret

    def main(self, args):
        S = System.currentTimeMillis()
        self.is = INPUT.isEmpty() and