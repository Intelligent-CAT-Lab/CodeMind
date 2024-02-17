from sys import stdin
cnt = {}
for line in stdin:
    for c in line:
        d = chr(ord(c)|0x20)
        if 'a'<=d<='z':
            cnt[d] = cnt.get(d, 0) + 1
for i in range(ord('z')-ord('a')+1):
    c = chr(ord('a')+i)
    print(c, ':', cnt.get(c, 0))
