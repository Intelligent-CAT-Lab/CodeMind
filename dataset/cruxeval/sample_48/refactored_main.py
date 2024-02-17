names = []
if names == []:
    print("")
smallest = names[0]
for name in names[1:]:
    if name < smallest:
        smallest = name
names.remove(smallest)
print(names.join(smallest))