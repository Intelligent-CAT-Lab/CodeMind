import sys

s = sys.stdin.readline().strip()
check_s = False
check_n = False
check_w = False
check_e = False

for i in range(len(s)):
    if s[i] == 'S':
        check_s = True
    elif s[i] == 'N':
        check_n = True
    elif s[i] == 'W':
        check_w = True
    elif s[i] == 'E':
        check_e = True

if check_s == check_n and check_w == check_e:
    print("Yes")
else:
    print("No")