xs = [1, 2, 3]
for idx in reversed(range(-len(xs)-1, -1)):
    xs.insert(idx, xs.pop(0))
print(xs)