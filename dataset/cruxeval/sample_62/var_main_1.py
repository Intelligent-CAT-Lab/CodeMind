def f(user):
    if len(list(user.keys())) > len(list(user.values())):	## user = CLRJ
        return tuple(user.keys())
    return tuple(user.values())	## user = CLRJ
