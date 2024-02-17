array = ['23']
value = 123

array.reverse()
array.pop()
odd = []
while len(array) > 0:
    tmp = {}
    tmp[array.pop()] = value
    odd.append(tmp)
result = {}
while len(odd) > 0:
    result.update(odd.pop())
print(result)