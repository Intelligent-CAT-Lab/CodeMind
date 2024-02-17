def f(chemicals, num):
    fish = chemicals[1:]
    chemicals.reverse()
    for i in range(num):
        fish.append(chemicals.pop(1))
    chemicals.reverse()
    return chemicals