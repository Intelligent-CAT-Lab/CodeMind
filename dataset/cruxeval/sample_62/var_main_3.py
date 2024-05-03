def f(user):
    if len(list(user.keys())) > len(list(user.values())):	## <state>user = CLRJ</state>
        return tuple(user.keys())
    return tuple(user.values())	## <state>user = CLRJ</state>
