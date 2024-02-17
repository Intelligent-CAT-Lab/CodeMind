def f(names, excluded):
    excluded = excluded
    for i in range(len(names)):
        if excluded in names[i]:
            names[i] = names[i].replace(excluded, "")
    return names