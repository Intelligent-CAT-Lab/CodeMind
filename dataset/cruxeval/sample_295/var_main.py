def f(fruits):
    if fruits[-1] == fruits[0]:	## {"fruits" : ''}
        return 'no'
    else:
        fruits.pop(0)	## {"fruits" : ''}
        fruits.pop()	## {"fruits" : ''}
        fruits.pop(0)	## {"fruits" : ''}
        fruits.pop()	## {"fruits" : ''}
        return fruits	## {"fruits" : ''}
