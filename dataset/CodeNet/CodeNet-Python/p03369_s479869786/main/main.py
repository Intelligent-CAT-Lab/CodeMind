# A
s = str(eval(input()))

ans = 700
for i in list(s):
    if i == 'o':
        ans += 100
print(ans)