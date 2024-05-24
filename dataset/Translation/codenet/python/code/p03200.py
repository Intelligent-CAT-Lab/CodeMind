s = input()

cnt = 0
l = 0

for i in range(len(s)):
    if s[i] == 'W':
        cnt += i-l
        l += 1

print(cnt)