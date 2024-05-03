def f(name):
    new_name =''	## <state>new_name = CLRJ</state>
    name = name[::-1]	## <state>name = CLRJ</state>
    for i in range(len(name)):	## <state>i = CLRJ | name = CLRJ</state>
        n = name[i]	## <state>n = CLRJ | name = CLRJ | i = CLRJ</state>
        if n !='.' and  new_name.count('.')<2:	## <state>n = CLRJ | new_name = CLRJ</state>
            new_name=n+new_name	## <state>new_name = CLRJ | n = CLRJ</state>
        else:
            break
    return new_name	## <state>new_name = CLRJ</state>
