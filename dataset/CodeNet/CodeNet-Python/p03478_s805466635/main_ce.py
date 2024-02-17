def SumOfDigits(n): #各桁の和を計算する関数
    sum = 0
    while n > 0:
        sum += (n % 10)
        n //= 10
    return sum
n, a, b = map(int, "20 2 5".split())
sum = 0
for i in range(n+1):
    add = 0
    add = SumOfDigits(i)
    if a <= add and add <= b:
        sum += i
print(sum)