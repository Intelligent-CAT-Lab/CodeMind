text = "echo hello!!! nice!"
ls = text.split()
lines = " ".join(ls[::3]).splitlines()
res = []
for i in range(2):
    ln = ls[1::3]
    if 3 * i + 1 < len(ln):
        res.append(" ".join(ln[3 * i:3 * (i + 1)]))
print(lines + res)