class main:
    def pow(base, n):
        ret_val = 1
        while n > 0:
            if n & 1:
                ret_val *= base
            n >>= 1
            base *= base
        return ret_val
    
    def solve(x):
        pow_map = {0: 0, 1: 1}
        
        before_pow = 1
        base = 2
        while True:
            pow_val = pow(base, 5)
            pow_map[pow_val] = base
            if pow_val - before_pow > x:
                break
            base += 1
            before_pow = pow_val
    
        for pow_val, base in pow_map.items():
            diff = abs(x - pow_val)
            if diff in pow_map:
                print(pow_map[pow_val], end=' ')
                if pow_val - x < 0:
                    print(-pow_map[diff])
                else:
                    print(pow_map[diff])
                return
    
    if __name__ == '__main__':
        x = int(input())
        solve(x)