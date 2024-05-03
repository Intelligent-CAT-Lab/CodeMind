def f(fruits):
    if fruits[-1] == fruits[0]:	## <state>fruits = CLRJ</state>
        return 'no'
    else:
        fruits.pop(0)	## <state>fruits = CLRJ</state>
        fruits.pop()	## <state>fruits = CLRJ</state>
        fruits.pop(0)	## <state>fruits = CLRJ</state>
        fruits.pop()	## <state>fruits = CLRJ</state>
        return fruits	## <state>fruits = CLRJ</state>
