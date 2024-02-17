x = 8
base = 3
ret = ""
while x > 0:
    ret = str(x % base) + ret
    x //= base
print(ret)