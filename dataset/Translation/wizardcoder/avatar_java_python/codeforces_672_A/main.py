import math

in_ = input()
n = int(in_)
s = " "
for i in range(1, n+1):
    s += str(i)
out_ = s[n-1]
print(out_)