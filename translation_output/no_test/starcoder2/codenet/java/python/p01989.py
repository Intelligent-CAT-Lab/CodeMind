
```
import sys

def solve(in, out, ms):
    s = in.next()
    length = len(s)
    ans = 0

    for i in range(1, length-2):
        for j in range(i+1, length-1):
            for k in range(j+1, length):
                a = [s[0:i], s[i:j], s[j:k], s[k:length]]
                for x in range(4):
                    if len(a[x]) != len(str(int(a[x]))):
                        continue
                b = [int(a[0]), int(a[1]), int(a[2]), int(a[3])]
                if b[0]<=255 and b[1]<=255 and b[2]<=255 and b[3]<=255:
                    ans += 1

    out.write(str(ans))

class Methods:
    def print(self, *ar):
        print(ar)

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)

    def gcd(self, a, b):
        return b if b==0 else self.gcd(b, a%b)

    def lcm(self, a, b):
        return a//self.gcd(a,b)*b

    def factorial(self, i):
        return 1 if i==1 else i*self.factorial(i-1)

    def manhat(self, x1, y1, x2, y2):
        return abs(x1-x2)+abs(y1-y2)

    def euclid(self, x1, y1, x2, y2):
        return (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)

    def isPrime(self, n):
        if n==2:
            return True
        if n<2 or n%2==0:
            return False
        for i in range(3, int(n**0.5)+1, 2):
            if n%i==0
