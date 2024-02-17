items = ['''1''', '+', '-', '**', '//', '*', '+']
target = '**'
if target in items:
    result = items.index(target)
else:
    result = -1
print(result)