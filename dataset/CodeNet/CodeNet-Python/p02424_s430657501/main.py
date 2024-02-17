a,b = map(int,input().split())
MASK = (1 << 32)-1
print("{:032b}".format(a & b))
print("{:032b}".format(a | b))
print("{:032b}".format(a ^ b))
