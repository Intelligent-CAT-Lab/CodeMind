import sys

s = sys.stdin.readline().strip()
abc = [False, False, False]

for i in range(len(s)):
    if s[i] == 'a':
        abc[0] = True
    elif s[i] == 'b':
        abc[1] = True
    elif s[i] == 'c':
        abc[2] = True

is_ok = True
for i in range(len(abc)):
    is_ok &= abc[i]

print("Yes" if is_ok else "No")