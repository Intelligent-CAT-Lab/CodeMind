import math

class p01639:
    def __init__(self):
        self.n = int(input())
        self.k = int(input()) - 1
        self.x0 = int(input())
        
    def run(self):
        self.solve()
        
    def solve(self):
        if self.x0 == 0:
            print("0")
            return
        
        x = self.x0
        s = int(1e4)
        count = [0] * s
        offset = math.pow(2, 63)
        M = s / math.pow(2, 64)
        
        for i in range(self.n):
            at = int((x + offset) * M)
            at = max(0, min(at, s - 1))
            count[at] += 1
            x ^= x << 13
            x ^= (x & 0xFFFFFFFFFFFFFFFF) >> 7
            x ^= x << 17
            
        sum = 0
        length = -1
        target = -1
        for i in range(s):
            if sum <= self.k and self.k < sum + count[i]:
                target = i
                length = count[i]
                break
            sum += count[i]
            
        now = 0
        is_list = [0] * length
        x = self.x0
        for i in range(self.n):
            at = int((x + offset) * M)
            at = max(0, min(at, s - 1))
            if at == target:
                is_list[now] = x
                now += 1
            x ^= x << 13
            x ^= (x & 0xFFFFFFFFFFFFFFFF) >> 7
            x ^= x << 17
        
        is_list.sort()
        print(f"{is_list[self.k - sum]}")

if __name__ == "__main__":
    obj = p01639()
    obj.run()