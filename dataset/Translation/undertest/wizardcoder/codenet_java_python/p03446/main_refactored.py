class main:
    import java.io.*;
    import java.math.BigInteger;
    import java.util.*;
    
    class p03446:
        def __init__(self):
            self.br = BufferedReader(InputStreamReader(System.in))
            self.out = PrintWriter(System.out)
            self.preCalc()
            self.submit()
            self.out.close()
    
        def preCalc(self):
            self.ways = [[1 for j in range(i+1)] for i in range(C)]
            for i in range(C):
                for j in range(1, i):
                    self.ways[i][j] = (self.ways[i-1][j] + self.ways[i-1][j-1]) % P
    
        def submit(self):
            a = self.nextInt()
            b = self.nextInt()
            c = self.nextInt()
            d = self.nextInt()
            e = self.nextInt()
            f = self.nextInt()
    
            if d % a!= 0 or e % b!= 0 or f % c!= 0:
                self.out.println(0)
                return
    
            p = d // a
            q = e // b
            r = f // c
    
            dp = [[0 for j in range(q+1)] for i in range(p+1)]
            dp[p][q] = 1
    
            ans = 0
    
            for x in range(p-1, 0, -1):