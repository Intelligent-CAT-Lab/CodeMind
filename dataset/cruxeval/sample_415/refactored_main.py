array = ((8, 5), (8, 2), (5, 3))
d = dict(array)
for key, value in d.items():
    if value < 0 or value > 9:
        print(None)
        break
print(d)