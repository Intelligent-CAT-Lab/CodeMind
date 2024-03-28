import sys
import random
import math

MOD = 998244353

def main():
    sc = FastScanner()
    N = sc.ni()
    A = sc.ni()
    B = sc.ni()
    print(min(A*N,B))

def dist(p1, p2):
    return (abs(p2[0]-p1[0])+abs(p2[1]-p1[1]))

def gcd(a, b):
    if a < b: return gcd(b,a)
    if b == 0:
        return a
    else:
        return gcd(b,a%b)

def power(x, y, m): 
    if y < 0: return 0
    ans = 1
    x %= m
    while (y > 0): 
        if(y % 2 == 1): 
            ans = (ans * x) % m
        y /= 2
        x = (x * x) % m
    return ans 

def shuffle(array):
    random.shuffle(array)
    return array

def sort(array):
    array.sort(key = lambda x: (x[0], x[1]))
    return array

class FastScanner: 
    def __init__(self): 
        self.br = sys.stdin

    def next(self): 
        while (self.st == None or not self.st.hasMoreElements()): 
            try: 
                self.st = FastScanner.StringTokenizer(self.br.readline())
            except Exception: 
                pass
        return self.st.nextToken() 

    def ni(self): 
        return int(self.next()) 

    def nl(self): 
        return long(self.next()) 

    def nd(self): 
        return float(self.next()) 

    def