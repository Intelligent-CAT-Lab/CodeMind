n = int(input())
ans = n
for a in range(2, int(n/2)+1):
    b = n - a
    sum = sum(int(digit(a)) + int(digit(b)))
    ans = min(sum, ans)
print(ans)

def digit(num):
    r = 0
    while num != 0:
        r += num % 10
        num //= 10
    return r