def f(chemicals, num):
    fish = chemicals[1:]	## fish = CLRJ | chemicals = CLRJ
    chemicals.reverse()	## chemicals = CLRJ
    for i in range(num):	## num = CLRJ
        fish.append(chemicals.pop(1))
    chemicals.reverse()	## chemicals = CLRJ
    return chemicals	## chemicals = CLRJ
