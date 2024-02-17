#!/usr/bin/env python3
s = input()
t = 0
d = {t:0}
for i in (ord(x)-ord('a') for x in s) :
	t ^= 1 << i
	d[t] = min(d[t] if t in d else 1000000, min((d[t^(1<<j)] for j in range(26) if t^(1<<j) in d))+1)
print(d[t] if d[t] else 1)
