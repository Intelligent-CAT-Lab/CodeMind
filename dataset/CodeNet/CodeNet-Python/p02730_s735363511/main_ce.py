import sys
s = "akasaka".rstrip()
n = len(s)
r_s = ''
for c in reversed(s):
    r_s = r_s + c
if s != r_s:
    print('No')
    sys.exit()
top = ''
for i in range(int((n - 1)/2)):
    top = top + s[i]
r_top = ''
for c in reversed(top):
    r_top = r_top + c
if top != r_top:
    print('No')
    sys.exit()
last = ''
for i in range(int((n + 3)/2) - 1, n):
    last = last + s[i]
r_last = ''
for c in reversed(last):
    r_last = r_last + c
if r_last != last:
    print('No')
    sys.exit()
print('Yes')