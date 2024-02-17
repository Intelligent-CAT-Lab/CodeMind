x = int(eval(input()))

ans = (x // 11) * 2
sub = x % 11
if sub >= 7:
    ans += 2
elif 0 < sub <= 6:
    ans += 1

print(ans)