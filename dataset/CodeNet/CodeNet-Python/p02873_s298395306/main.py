from itertools import*
a=b=0
for c,m in groupby(input()):m=len(list(m));a+=m*-~m//2-min(m,b)*(c>'<');b=m
print(a)