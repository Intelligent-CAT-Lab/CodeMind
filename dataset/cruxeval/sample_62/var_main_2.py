def f(user):
    if len(list(user.keys())) > len(list(user.values())):	## user = []
        return tuple(user.keys())
    return tuple(user.values())	## user = []
