colors = ["red","green","green"]
patterns = ["a", "b", "b"]

if len(colors) != len(patterns):
    return False    
sdict = {}
pset = set()
sset = set()    
for i in range(len(patterns)):
    pset.add(patterns[i])
    sset.add(colors[i])
    if patterns[i] not in sdict.keys():
        sdict[patterns[i]] = []

    keys = sdict[patterns[i]]
    keys.append(colors[i])
    sdict[patterns[i]] = keys

if len(pset) != len(sset):
    return False   

for values in sdict.values():

    for i in range(len(values) - 1):
        if values[i] != values[i+1]:
            print(False)
            break

print(True)