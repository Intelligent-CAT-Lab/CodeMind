a = [ int(i) for i in input().split() ]
a = sorted(a)
print( a[1] - a[0] + a[2] - a[1] )
