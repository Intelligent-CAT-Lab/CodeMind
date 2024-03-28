import java.io.PrintStream
import java.util.Scanner

class p03362:
    so = System.out
    sc = Scanner(System.in)
    INF = Integer.MAX_VALUE
    
    mh = [0, 1, 0, -1]
    mw = [1, 0, -1, 0]
    
    def main(self):
        N = self.ni()
        
        count = 0
        for i in range(6, 55556, 5):
            if self.isPrime(i):
                self.so.print(i + " ")
                count += 1
            if count == N:
                break
    
    def isPrime(self, n):
        for i in range(2, int(n**0.5)+1):
            if n % i == 0:
                return False
        return True
    
    def ni(self):
        return self.sc.nextInt()
    
    def nl(self):
        return self.sc.nextLong()
    
    def nsToChars(self):
        return self.sc.next().toCharArray()

p03362().main()