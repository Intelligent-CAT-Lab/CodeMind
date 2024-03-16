```python
class Edge:
    def __init__(self, to, cost):
        self.to = to
        self.cost = cost
        
    def __lt__(self, other):
        return self.cost < other.cost

class Edge2:
    def __init__(self, from_, to, cost):
        self.from_ = from_
        self.to = to
        self.cost = cost
        
    def __lt__(self, other):
        return self.cost < other.cost

class RMQ:
    def __init__(self, s):
        self.size_ = 1
        while self.size_ < s:
            self.size_ *= 2
        self.dat = [2147483647] * (self.size_ * 2)
    
    def query_(self, a, b, k, l, r):
        if r <= a or b <= l:
            return 2147483647
        if a <= l and r <= b:
            return self.dat[k]
        lc = self.query_(a, b, 2 * k, l, (l + r) // 2)
        rc = self.query_(a, b, 2 * k + 1, (l + r) // 2, r)
        return min(lc, rc)
    
    def update(self, pos, x):
        pos += self.size_
        self.dat[pos] = x
        while pos > 1:
            pos //= 2
            self.dat[pos] = min(self.dat[2 * pos], self.dat[2 * pos + 1])
    
    def query(self, l, r):
        return self.query_(l, r, 1, 0, self.size_)


mod = 1000000007
INF = float('inf')
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
dx8 = [0, 0, 1, -1, 1, 1, -1, -1]
dy8 = [1, -1, 0, 0, 1, -1, -1, 1]


def gcd(n, m):
    if m > n:
        return gcd(m, n)
    if m == 0:
        return n
    return gcd(m, n % m)

def lcm(m, n):
    return (m // gcd(m, n)) * n


def main():
    a = []
    for i in range(4):
        a.append(int(input()))

    a.sort()
    print(abs(a[0] + a[3] - a[1] - a[2]))


if __name__ == "__main__":
    main()
``` 
