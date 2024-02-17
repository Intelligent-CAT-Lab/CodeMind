x = "1/5"
n = "5/1"
a, b = x.split("/")
c, d = n.split("/")
numerator = int(a) * int(c)
denom = int(b) * int(d)
if (numerator/denom == int(numerator/denom)):
    print(True)
else:
    print(False)