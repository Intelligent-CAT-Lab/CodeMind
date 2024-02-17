user = {"eating" : "ja", "books" : "nee", "piano" : "coke", "excitement" : "zoo"}
if len(list(user.keys())) > len(list(user.values())):
    print(tuple(user.keys()))
else:
    print(tuple(user.values()))