a = (1, )
b = (1, )
c = (1, 2)
result = {}
for d in a, b, c:
    result.update(dict.fromkeys(d))
print(result)