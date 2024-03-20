import java.io.*;
import java.util.*;

class p00957:
    def main(self):
        sc = MyScanner()
        out = PrintWriter(BufferedOutputStream(System.out))
        l = sc.nextInt()
        k = sc.nextInt()
        dp = [[0 for i in range(l+1)] for j in range(2)]
        dp[0][0] = 1
        for i in range(1, l+1):
            dp[0][i] += dp[1][i-1]
            dp[1][i] += dp[0][i-1]
            if i >= k:
                dp[1][i] += dp[0][i-k]
        ans = 0
        for i in range(1, l+1):
            ans += dp[1][i]
        out.println(ans)
        out.close()

#-----------PrintWriter for faster output---------------------------------
class PrintWriter:
    def __init__(self, out):
        self.out = out
    def println(self, x):
        self.out.write(str(x) + "\n")
    def close(self):
        self.out.close()

#-----------MyScanner class for faster input----------
class MyScanner:
    def __init__(self):
        self.br = BufferedReader(InputStreamReader(System.in))
    def next(self):
        try:
            return self.br.readLine().strip()
        except:
            return None
    def nextInt(self):
        return int(self.next())
    def nextLong(self):
        return long(self.next())
    def nextDouble(self):
        return float(self.next())
    def nextLine(self):
        return self.next()

p00957().main()