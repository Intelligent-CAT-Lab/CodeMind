def f(chemicals, num):
    fish = chemicals[1:]	## fish = [] | chemicals = []
    chemicals.reverse()	## chemicals = []
    for i in range(num):	## num = []
        fish.append(chemicals.pop(1))
    chemicals.reverse()	## chemicals = []
    return chemicals	## chemicals = []
