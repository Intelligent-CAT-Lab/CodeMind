def p03502():
    X = int(input())

    N = X

    fx = 0

    while N >= 10:
        fx += N % 10
        N //= 10

    fx += N

    if X % fx == 0:
        print("Yes")
    else:
        print("No")

# Call the function to execute the code
p03502()