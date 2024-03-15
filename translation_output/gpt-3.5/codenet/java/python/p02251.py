```python
import sys
import math

class p02251:
    def solve(self):
        n = int(input())
        ans = 0
        
        # 25cent
        ans += n // 25
        n %= 25
        
        # 10cent
        ans += n // 10
        n %= 10
        
        # 5cent
        ans += n // 5
        n %= 5
        
        # 1cent
        ans += n
        
        print(ans)

    @staticmethod
    def max(*args):
        return max(args)

    @staticmethod
    def min(*args):
        return min(args)

    @staticmethod
    def calc_manhattan_distance(x1, y1, x2, y2):
        d = abs(x1 - x2) + abs(y1 - y2)
        return d

    @staticmethod
    def calc_euclidean_distance(x1, y1, x2, y2):
        d = math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)
        return d

    @staticmethod
    def is_prime(n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(math.sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True

if __name__ == "__main__":
    p = p02251()
    p.solve()
```

