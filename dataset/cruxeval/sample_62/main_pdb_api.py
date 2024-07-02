def f(user):
    if len(list(user.keys())) > len(list(user.values())):
        return tuple(user.keys())
    return tuple(user.values())
f({"eating" : "ja", "books" : "nee", "piano" : "coke", "excitement" : "zoo"})