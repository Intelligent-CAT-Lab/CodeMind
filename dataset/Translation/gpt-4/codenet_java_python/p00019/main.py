def factorial(N):
    ans = 1
    while N > 1:
        ans *= N
        N -= 1
    return ans

# input
N = int(input())

# calculation and output
print(factorial(N))