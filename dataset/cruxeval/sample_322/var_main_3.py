def f(chemicals, num):
    fish = chemicals[1:]	## <state>fish = CLRJ | chemicals = CLRJ</state>
    chemicals.reverse()	## <state>chemicals = CLRJ</state>
    for i in range(num):	## <state>num = CLRJ</state>
        fish.append(chemicals.pop(1))
    chemicals.reverse()	## <state>chemicals = CLRJ</state>
    return chemicals	## <state>chemicals = CLRJ</state>
