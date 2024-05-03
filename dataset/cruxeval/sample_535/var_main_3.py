def f(n):
    for n in str(n):	## <state>n = CLRJ</state>
        if n not in "012" and n not in list(range(5, 10)):	## <state>n = CLRJ</state>
            return False
    return True