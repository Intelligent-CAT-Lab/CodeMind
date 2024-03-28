```python
# Constants
MOD = 998244353

# Helper functions for modular arithmetic
def add(a, b):
    res = a + b
    return res - MOD if res >= MOD else res

def sub(a, b):
    res = a - b
    return res + MOD if res < 0 else res

def mul(a, b):
    res = (a * b) % MOD
    return res + MOD if res < 0 else res

def pow(a, e):
    if e == 0:
        return 1
    r = a
    for i in range(30 - a.bit_length(), -1, -1):
        r = mul(r, r)
        if (e & (1 << i)) != 0:
            r = mul(r, a)
    return r

def inv(a):
    return pow(a, MOD - 2)

# Variables to hold factorials and their modular inverses
facts = []
facts_inv = []

# Function to calculate binomial coefficient
def c(x, y):
    return mul(mul(facts[x + y], facts_inv[x]), facts_inv[y])

# Main solve function
def solve(n, m):
    global facts, facts_inv
    facts = [1] * (n + 3 * m // 2 + 1)
    for i in range(1, len(facts)):
        facts[i] = mul(facts[i - 1], i)
    
    facts_inv = [0] * len(facts)
    facts_inv[-1] = inv(facts[-1])
    for i in range(len(facts) - 1, 0, -1):
        facts_inv[i - 1] = mul(facts_inv[i], i)
    
    ans = 0
    for n_odd in range(m % 2, min(m, n) + 1, 2):
        cans = c(n_odd, n - n_odd)
        cans1 = c((3 * m - n_odd) // 2, n - 1)
        cans2 = mul(n_odd, c((m - n_odd) // 2, n - 1))
        
        if n_odd < m:
            cans2 = add(cans2, mul(n - n_odd, c((m - n_odd) // 2 - 1, n - 1)))
        
        ans = add(ans, mul(cans, sub(cans1, cans2)))
    
    return ans

# Helper functions to replace the I/O in the Java version.
# In Python, we typically use input() for input and print() for output.
def scan_int():
    return int(input().strip())

def scan_long():
    return int(input().strip())

def scan_string():
    return input().strip()

# Main function
def main():
    n = scan_int()
    m = scan_int()
    result = solve(n, m)
    print(result)

# Entry point
if __name__ == "__main__":
    main()
```

I have converted the Java code to Python and replaced Java I/O with Python's standard `input()` and `print()` functions. The functionality remains the same, with modular arithmetic operations and computation of binomial coefficients. However, the inline import statements and explicit error handling from the Java program are not translated to Python as they are generally not necessary in a Python context.
