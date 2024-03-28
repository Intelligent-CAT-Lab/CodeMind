import math

class P01639:
    def run(self):
        n, k, x0 = map(int, input().split())
        self.solve(n, k - 1, x0)
    
    def solve(self, n, k, x0):
        if x0 == 0:
            print("0")
            return

        x = x0
        s = int(1e4)
        count = [0] * s
        offset = math.pow(2, 63)
        M = s / math.pow(2, 64)
        
        for _ in range(n):
            at = int((x + offset) * M)
            at = max(0, at) if at < 0 else min(s - 1, at)
            count[at] += 1
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17

        sum_count = 0
        length = -1
        target = -1
        
        for i in range(s):
            if sum_count <= k < sum_count + count[i]:
                target = i
                length = count[i]
                break
            sum_count += count[i]
        
        now = 0
        is_array = [0] * length
        x = x0
        
        for _ in range(n):
            at = int((x + offset) * M)
            at = max(0, at) if at < 0 else min(s - 1, at)
            
            if at == target:
                is_array[now] = x
                now += 1
                
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17
        
        is_array.sort()
        print(is_array[k - sum_count])

if __name__ == '__main__':
    p = P01639()
    p.run()