import math

def solve(x):
    max_diff = 10**9
    pow_map = {0: 0, 1: 1}
    base = 2
    while True:
        pow_val = pow(base, 5)
        pow_map[pow_val] = base
        if pow_val - before_pow > x:
            break
        base += 1
        before_pow = pow_val
    
    for key, value in pow_map.items():
        diff = abs(x - key)
        if diff in pow_map:
            print(value, end=' ')
            if pow_val - x < 0:
                print('-' + str(pow_map[diff]), end='')
            else:
                print(str(pow_map[diff]), end='')
            print()
            return

def main():
    x = int(input())
    solve(x)

if __name__ == "__main__":
    main()