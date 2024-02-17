data = {'inf': ['a', 'b'], 'a': ["inf", "c"], 'd': ["inf"]}
members = []
for item in data:
    for member in data[item]:
        if member not in members:
            members.append(member)
print(sorted(members))