from math import factorial

# Calculate the factorial of 1510
fact = factorial(1510) + 2

while True:
    try:
        n = int(input())
        print(fact)

        for i in range(2, 2 + n):
            print(i)
    except EOFError:
        break