t = "fubarbaz"
a, sep, b = t.rpartition('-')
if len(b) == len(a):
    print('imbalanced')
print(a + b.replace(sep, ''))