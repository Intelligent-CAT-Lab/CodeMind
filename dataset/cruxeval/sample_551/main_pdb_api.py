def f(data):
    members = []
    for item in data:
        for member in data[item]:
            if member not in members:
                members.append(member)
    return sorted(members)
f({'inf': ['a', 'b'], 'a': ["inf", "c"], 'd': ["inf"]})