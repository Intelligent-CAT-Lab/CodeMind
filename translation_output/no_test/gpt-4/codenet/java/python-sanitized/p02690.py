import sys
from collections import defaultdict

class p02690:
    
    maxDiff = 1_000_000_000

    def solve(self):
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

        for pow_val, base in pow_map.items():
            diff = abs(x - pow_val)
            if diff in pow_map:
                print(pow_map[pow_val], end='')
                if pow_val - x < 0:
                    print(f" -{pow_map[diff]}")
                else:
                    print(f" {pow_map[diff]}")
                return

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