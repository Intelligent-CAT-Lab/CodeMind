s = eval(input())
if s[0] == s[-1]:
    if len(s) % 2:
        ans = 'Second'
    else:
        ans = 'First'
else:
    if len(s) % 2:
        ans = 'First'
    else:
        ans = 'Second'
print(ans)