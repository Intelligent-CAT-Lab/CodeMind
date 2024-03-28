class main:
    import sys
    
    class p01606:
        def __init__(self):
            self.sc = sys.stdin
    
        def run(self):
            n, w = map(int, self.sc.readline().split())
            self.solve(n, w)
    
        def solve(self, n, w):
            INF = 1 << 28
            EPS = 1e-12
    
            flag = [False] * (n+1)
            count = [0] * (n+1)
            sum = 0
            left = 1
            right = w+1
    
            for i in range(1, w):
                for k in range(1, int(i**0.5)+1):
                    if i % k == 0:
                        count[k] += 1
                        self.update(k)
                        if i // k!= k:
                            count[i//k] += 1
                            self.update(i//k)
    
            for i in range(0, n-w+1):
                left = i+1
                right = i+w+1
                for k in range(1, int(i**0.5)+1):
                    if i % k == 0:
                        count[k] -= 1
                        self.update(k)
                        if i // k!= k:
                            count[i//k] -= 1
                            self.update(i//k)
                for k in range(1, int((i+w)**0.5)+1):
                    if (i+w) % k == 0:
                        count[k] += 1
                        self.update(k)
                        if (i+w) // k!= k:
                            count[(i+w)//k] += 1
                            self.update((i+w)//k)
                self.update(left-1)
                self.update(right-1)
                print(sum+(i<n-w))
    
        def update(self, i):
            det = left <= i < right
            if flag[i] and not det and count[i] < 2:
                flag[i] = False
                sum -= 1
            if not flag[i] and (det or count[i] >= 2):
                flag[i] = True
                sum += 1
    
        def debug(self, *os):
            print(*os)
    
        def print(self, s):
            print(s, end='')
    
        def println(self, s):
            print(s)
    
    p01606().run()