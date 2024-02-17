l = [1, 2, 4, 10]
if l == sorted(l) or l == sorted(l, reverse=True):
    print(True)
else:
    print(False)