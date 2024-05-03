def f(names, excluded):
    excluded = excluded	## excluded = CLRJ
    for i in range(len(names)):	## i = CLRJ | names = CLRJ
        if excluded in names[i]:	## excluded = CLRJ | names = CLRJ | i = CLRJ
            names[i] = names[i].replace(excluded, "")	## names = CLRJ | i = CLRJ | excluded = CLRJ
    return names	## names = CLRJ
