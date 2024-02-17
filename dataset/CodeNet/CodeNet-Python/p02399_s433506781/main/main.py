a,b = tuple(int(n) for n in input().split())

d,r = divmod(a,b)
f = a / b

print(("{} {} {:.5f}".format(d,r,f)))
