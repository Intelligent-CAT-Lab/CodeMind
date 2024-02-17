string = 'PoIOarTvpoead'
upper = 0
for c in string:
    if c.isupper():
        upper += 1
print(upper * (2,1)[upper % 2])