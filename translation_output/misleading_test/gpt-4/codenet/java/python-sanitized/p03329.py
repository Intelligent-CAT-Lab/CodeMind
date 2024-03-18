# MAX_N = 110000 (Python doesn't require explicit size for array initialization)
memo = {}  # memo will be a dictionary where keys are the n values and values are the computed minimums

def main():
    n = int(input())
    ans = calc(n)
    print(ans)

def calc(n):
    if n == 0:
        return 0
    if n in memo:
        return memo[n]  # Return the memoized value if already computed

    res = n  # Start with the worst case scenario, where we only subtract 1 each time
    pow6 = 1
    while pow6 <= n:  # Pythonic way to iterate over powers of 6
        res = min(res, calc(n - pow6) + 1)
        pow6 *= 6

    pow9 = 1
    while pow9 <= n:  # Pythonic way to iterate over powers of 9
        res = min(res, calc(n - pow9) + 1)
        pow9 *= 9
    
    memo[n] = res  # Memoize the result before returning
    return res

# Invoke the main function to start the program
if __name__ == "__main__":
    main()