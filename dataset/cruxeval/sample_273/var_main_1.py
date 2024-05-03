def f(name):
    new_name =''	## new_name = CLRJ
    name = name[::-1]	## name = CLRJ
    for i in range(len(name)):	## i = CLRJ | name = CLRJ
        n = name[i]	## n = CLRJ | name = CLRJ | i = CLRJ
        if n !='.' and  new_name.count('.')<2:	## n = CLRJ | new_name = CLRJ
            new_name=n+new_name	## new_name = CLRJ | n = CLRJ
        else:
            break
    return new_name	## new_name = CLRJ
