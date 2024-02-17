a = [ int(i) for i in "1 6 3".split() ]
a = sorted(a)
print( a[1] - a[0] + a[2] - a[1] )
