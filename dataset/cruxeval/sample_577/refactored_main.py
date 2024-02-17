items = [(1, 'pos')]
result = []
for number in items:
    d = dict(items).copy()
    d.popitem()
    result.append(d)
    items = d
print(result)