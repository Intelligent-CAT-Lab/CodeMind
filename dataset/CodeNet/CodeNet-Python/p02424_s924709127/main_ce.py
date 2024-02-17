a, b = map(int, "8 10".split())
MASK = (1 << 32) - 1
print("{:032b}".format(a & b))
print("{:032b}".format(a | b))
print("{:032b}".format(a ^ b))
