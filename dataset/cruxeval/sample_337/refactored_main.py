txt = "5ll6"
d = []
for c in txt:
    if c.isdigit():
        continue
    if c.islower():
        d.append(c.upper())
    elif c.isupper():
        d.append(c.lower())
print(''.join(d))