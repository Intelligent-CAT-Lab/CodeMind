chemicals = ['lsi', 's', 't', 't', 'd']
num = 0
fish = chemicals[1:]
chemicals.reverse()
for i in range(num):
    fish.append(chemicals.pop(1))
chemicals.reverse()
print(chemicals)