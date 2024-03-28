class main:
    import java.util.Arrays;
    import java.util.Scanner;
    
    class p03375:
    
        M = 0
        S = []
        C = []
        N = 0
    
        def complex(self, N):
            res = [[0]*(N+1) for i in range(N+1)]
            for i in range(N+1):
                res[i][0] = res[i][i] = 1
                for j in range(1, i):
                    res[i][j] = (res[i-1][j] + res[i-1][j-1]) % self.M
            return res
    
        def stirling(self, N):
            res = [[0]*(N+1) for i in range(N+1)]
            # i starts from 0 to N
            for i in range(N+1):
                res[i][0] = res[i][i] = 1
                for j in range(1, i):
                    res[i][j] = (res[i-1][j-1] + (j+1)*res[i-1][j]) % self.M
            return res
    
        # a^x
        def beki(self, a, x):
            res = 1
            for i in range(32):
                if ((x >> i) & 1) == 1:
                    res = (res * a) % self.M
                a = (a * a) % self.M
            return res
    
        def ways(self, i):
            res = 0
            b1 = self.beki(2, self.N - i)
            beki1 = 1
            beki2 = self.beki(2, self.beki(2, self.N - i, self.M-1) % (self.M-1))
            for j in range(i+1):
                res = (res + self.ways2(i, j, beki1, beki2)) % self.M
                beki1 = (beki1 * b1) % self.M
            return res
    
        def ways2(self, i, j, beki1, beki2):
            return (self.S[i][j] * beki1 % self.M * beki2 % self.M) % self.M
    
        def main(self):
            scan = Scanner(System.in)
            self.N = scan.nextInt()
            self.M = scan.nextLong()
            self.C = self.complex(self.N)
            self.S = self.stirling(self.N)
            ans = 0
            for i in range(self.N+1):
                ans = (ans + (i%2==0)*1 - (i%2==1)*1)*(self.C[self.N][i]*self.ways(i)) % self.M + (i%2==0)*0 + (i%2==1)*self.M
            print(ans)
    
    p03375().main()