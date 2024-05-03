def f(names, excluded):
    excluded = excluded	## excluded = []
    for i in range(len(names)):	## i = [] | names = []
        if excluded in names[i]:	## excluded = [] | names = [] | i = []
            names[i] = names[i].replace(excluded, "")	## names = [] | i = [] | excluded = []
    return names	## names = []
