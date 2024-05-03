def f(name):
    if name.islower():	## <state>name = CLRJ</state>
        name = name.upper()
    else:
        name = name.lower()	## <state>name = CLRJ</state>
    return name	## <state>name = CLRJ</state>
