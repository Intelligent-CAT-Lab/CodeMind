n,a,b = map(int,"8 3 4".split())
k = n//(a+b)
p = n%(a+b)
print(k*a + min(p,a))
