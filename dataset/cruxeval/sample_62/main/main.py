def f(user):
    if len(list(user.keys())) > len(list(user.values())):
        return tuple(user.keys())
    return tuple(user.values())