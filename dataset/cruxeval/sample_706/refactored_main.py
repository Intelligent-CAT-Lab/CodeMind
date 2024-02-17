r = "ab"
w = "xy"
a = []
if r[0] == w[0] and w[-1] == r[-1]:
    a.append(r)
    a.append(w)
else:
    a.append(w)
    a.append(r)
print(a)