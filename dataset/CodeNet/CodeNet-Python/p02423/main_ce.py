n = int("8")
mask = (1<<32)-1
print('{:032b}'.format(n))
print('{:032b}'.format(~n & mask))
print('{:032b}'.format((n<<1)& mask))
print('{:032b}'.format((n>>1)& mask))
