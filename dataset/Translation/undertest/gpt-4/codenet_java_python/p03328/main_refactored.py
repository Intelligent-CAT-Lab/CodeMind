class main:
    # Read inputs
    a, b = map(int, input().split())
    n = b - a
    # Calculate and print the result
    print(n * (n + 1) // 2 - b)