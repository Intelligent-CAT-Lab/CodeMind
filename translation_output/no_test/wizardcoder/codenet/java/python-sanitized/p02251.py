import java.util.*;
import java.io.*;

class p02251:
    def solve(self):
        n = self.nextInt()
        ans = 0
        
        #25cent
        ans += n//25
        n %= 25
        
        #10cent
        ans += n//10
        n %= 10
        
        #5cent
        ans += n//5
        n %= 5
        
        #1cent
        ans += n
        
        self.out.println(ans)
        
    def __init__(self):
        self.out = PrintWriter(System.out)
        self.solve()
        self.out.flush()
        
    # <Default Field>
    maxInt = Integer.MAX_VALUE
    minInt = Integer.MIN_VALUE
    mod = 1000000007
    
    # <Default Method>
    def max(self, *ar):
        ar = sorted(ar)
        return ar[-1]
    
    def min(self, *ar):
        ar = sorted(ar)
        return ar[0]
    
    def calcManhatDistance(self, x1, y1, x2, y2):
        d = abs(x1-x2) + abs(y1-y2)
        return d
    
    def calcEuclidDistance(self, x1, y1, x2, y2):
        d = math.sqrt((x2-x1)**2 + (y2-y1)**2)
        return d
    
    def isPrime(self, n):
        if n == 2: return True
        if n < 2 or n % 2 == 0: return False
        d = math.sqrt(n)
        for i in range(3, int(d)+1, 2):
            if n % i == 0:
                return False
        return True
    
    def printChar2DArray(self, ar):
        for i in range(len(ar)):
            for j in range(len(ar[0])):
                self.out.print(ar[i][j])
            self.out.println()
    
    # <Fast Scanner> START -------------------------------------------------
    in = System.in
    buffer = bytearray(1024)
    length = 0
    p = 0
    
    def hasNextByte(self):
        if p < length: return True
        else:
            p = 0
            try:
                length = self.in.read(buffer)
            except Exception as e:
                e.printStackTrace()
            if length == 0: return False
        return True
    
    def readByte(self):
        if self.hasNextByte() == True: return buffer[p]
        return -1
    
    def isPrint