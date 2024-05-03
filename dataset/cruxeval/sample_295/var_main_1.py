def f(fruits):
    if fruits[-1] == fruits[0]:	## fruits = CLRJ
        return 'no'
    else:
        fruits.pop(0)	## fruits = CLRJ
        fruits.pop()	## fruits = CLRJ
        fruits.pop(0)	## fruits = CLRJ
        fruits.pop()	## fruits = CLRJ
        return fruits	## fruits = CLRJ
