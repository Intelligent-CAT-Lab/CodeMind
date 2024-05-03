def f(names, excluded):
    excluded = excluded	## <state>excluded = CLRJ</state>
    for i in range(len(names)):	## <state>i = CLRJ | names = CLRJ</state>
        if excluded in names[i]:	## <state>excluded = CLRJ | names = CLRJ | i = CLRJ</state>
            names[i] = names[i].replace(excluded, "")	## <state>names = CLRJ | i = CLRJ | excluded = CLRJ</state>
    return names	## <state>names = CLRJ</state>
