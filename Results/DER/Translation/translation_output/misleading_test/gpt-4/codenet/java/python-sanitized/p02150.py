def main():
    MOD = 1000000007

    # Reading inputs as integers split by spaces
    a, b, x = map(int, input().split())
    
    # Performing the calculations
    s = a - b
    count = max(x - a, 0) // s
    total = (count % MOD) * (a % MOD) % MOD
    x -= count * s

    while x >= a:
        total += a
        x += -a + b

    total += x
    total %= MOD

    # Printing the result
    print(total)


# Test case
# You could directly call the function main() if you want to adhere to the
# exact structure of the provided Java code. However, in Python, it's also
# common to check if the script is running as the main program and then call
# main(), which is why this is often seen in Python code.
if __name__ == "__main__":
    main()