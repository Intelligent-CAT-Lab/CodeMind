fruits = ['apple', 'apple', 'pear', 'banana', 'pear', 'orange', 'orange']
if fruits[-1] == fruits[0]:
    print('no')
else:
    fruits.pop(0)
    fruits.pop()
    fruits.pop(0)
    fruits.pop()
    print(fruits)