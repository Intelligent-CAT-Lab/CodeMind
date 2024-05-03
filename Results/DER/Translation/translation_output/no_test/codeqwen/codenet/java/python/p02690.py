```python
import sys

class p02690:
    maxDiff = 1_000_000_000

    def __init__(self):
        self.powMap = {0: 0, 1: 1}
        self.base = 2
        self.beforePow = 1

    def solve(self):
        x = int(input())
        self.populate_pow_map(x)
        self.find_closest_powers(x)

    def populate_pow_map(self, x):
        while True:
            pow_val = self.pow(self.base, 5)
            self.powMap[pow_val] = self.base
            if pow_val - self.beforePow > x:
                break
            self.base += 1
            self.beforePow = pow_val

    def find_closest_powers(self, x):
        for base, pow_val in self.powMap.items():
            diff = abs(x - pow_val)
            if diff in self.powMap:
                print(f"{pow_val}", end="")
                if pow_val - x < 0:
                    print(f" -{self.powMap[diff]}")
                else:
                    print(f" {self.powMap[diff]}")
                sys.exit()

    def pow(self, base, n):
        ret_val = 1
        while n > 0:
            if (n & 1) == 1:
                ret_val *= base
            n >>= 1
            base *= base
        return ret_val

if __name__ == "__main__":
    main_obj = p02690()
    main_obj.solve()
```
