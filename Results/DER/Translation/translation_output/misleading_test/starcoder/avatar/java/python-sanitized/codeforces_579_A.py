n = int(input())
s = ""
while n > 0:
    x = n % 2
    n = n // 2
    s += str(x) + " "
ans = 0
for i in s:
    if i == "1":
        ans += 1
print(ans)