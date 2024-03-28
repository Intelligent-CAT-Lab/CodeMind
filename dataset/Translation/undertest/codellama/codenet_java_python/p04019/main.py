import sys

s = sys.stdin.readline().strip()
check_s = False
check_n = False
check_w = False
check_e = False

for c in s:
    if c == 'S':
        check_s = True
    elif c == 'N':
        check_n = True
    elif c == 'W':
        check_w = True
    elif c == 'E':
        check_e = True

if check_s == check_n and check_w == check_e:
    print("Yes")
else:
    print("No")