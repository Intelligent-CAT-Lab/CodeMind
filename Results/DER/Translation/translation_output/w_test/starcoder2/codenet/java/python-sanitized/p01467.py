a = input().split()
b = input().split()
k = int(input())
max = 0
for i in range(1<<10):
    if bin(i).count('1') > k:
        continue
    borrow = [0] * 11
    c = [0] * 10
    for j in range(10):
        if int(a[j]) - borrow[j] >= int(b[j]):
            c[j] = int(a[j]) - borrow[j] - int(b[j])
            borrow[j+1] = 0
        else:
            c[j] = int(a[j]) - borrow[j] + 10 - int(b[j])
            borrow[j+1] = 1 if i & (1<<j) == 0 else 0
    ans = 0
    for j in range(9, -1, -1):
        ans *= 10
        ans += c[j]
    max = ans if ans > max else max
print(max)