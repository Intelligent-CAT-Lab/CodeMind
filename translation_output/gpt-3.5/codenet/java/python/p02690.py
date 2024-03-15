```python
import sys
from collections import defaultdict

class Solution:
    maxDiff = 1_000_000_000

    def main(self):
        x = int(input())
        
        pow_map = defaultdict(int)
        pow_map[0] = 0
        pow_map[1] = 1
        
        before_pow = 1
        base = 2
        while True:
            pow_val = self.pow(base, 5)
            pow_map[pow_val] = base
            if pow_val - before_pow > x:
                break
            base += 1
            before_pow = pow_val
        
        for pow_val, base_val in pow_map.items():
            diff = abs(x - pow_val)
            if pow_map.get(diff):
                print(base_val, end="")
                if pow_val - x < 0:
                    print(" -" + str(pow_map[diff]), end="")
                else:
                    print(" " + str(pow_map[diff]), end="")
                print()
                return
    
    def pow(self, base, n):
        ret_val = 1
        while n > 0:
            if n & 1:
                ret_val *= base
            n >>= 1
            base *= base
        return ret_val

if __name__ == "__main__":
    solution = Solution()
    solution.main()
```

