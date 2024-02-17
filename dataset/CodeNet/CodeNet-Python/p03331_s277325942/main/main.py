def DigitsSum(n):
    sum = 0
    while (n != 0):
        sum += (n % 10)
        n = int(n / 10)
    return sum

N = int(eval(input()))

min_sum = 10**5
for i in range(1, N):
    sum = DigitsSum(i) + DigitsSum(N-i)
    if (sum < min_sum):
        min_sum = sum

print(min_sum)
