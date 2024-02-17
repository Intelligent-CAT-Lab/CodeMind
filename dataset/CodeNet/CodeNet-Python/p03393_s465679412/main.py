from string import ascii_lowercase
s = input()
if len(s) != 26:
    nokori = set(ascii_lowercase) - set(s)
    print(s + min(nokori))
else:
    for i in range(2, 27):
        if s[-i] <= s[-i + 1]:
            break
        if i == 26:
            print(-1)
            exit()
    s_ = sorted(s[-i + 1:])
    for j in s_:
        if j > s[-i]:
            break
    print(s[:-i]+j)
