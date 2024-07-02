def f(fruits):
    if fruits[-1] == fruits[0]:
        return 'no'
    else:
        fruits.pop(0)
        fruits.pop()
        fruits.pop(0)
        fruits.pop()
        return fruits
f(['apple', 'apple', 'pear', 'banana', 'pear', 'orange', 'orange'])