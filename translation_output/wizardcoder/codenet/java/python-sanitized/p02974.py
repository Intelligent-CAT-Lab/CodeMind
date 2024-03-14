import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.util.Arrays
import java.util.InputMismatchException

def solve():
    n = ni()
    K = ni()
    if K % 2 == 1:
        out.println(0)
        return
    mod = 1000000007
    dp = [[0]*(2*n*n+1) for _ in range(n+1)]
    dp[0][n*n] = 1
    for i in range(1, n+1):
        ndp = [[0]*(2*n*n+1) for _ in range(n+1)]
        for j in range(n+1):
            for k in range(2*n*n+1):
                if dp[j][k] ==