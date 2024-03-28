import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter

class p02974:
    is = None
    out = None
    INPUT = ""

    def solve(self):
        n = self.ni()
        K = self.ni()
        if K % 2 == 1:
            self.out.println(0)
            return

        mod = 1000000007
        dp = [[0]*(2*n*n+1) for _ in range(n+1)] # [æåpathã®source=sinkã®åæ°][å¥å¦