# -*- coding: utf-8 -*-
(n,m)=[int(a) for a in "3 100".split()]
for i in range(n):
    if i:print(" ",end="")
    if i<=n/2: print("0",end="")
    else: print("{}".format(m),end="")
print("")