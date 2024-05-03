def f(lines):
    for i in range(len(lines)):	## i = CLRJ | lines = CLRJ
        lines[i] = lines[i].center(len(lines[-1]))	## lines = CLRJ | i = CLRJ
    return lines	## lines = CLRJ
