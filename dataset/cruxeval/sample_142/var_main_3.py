def f(x):
    if x.islower():	## <state>x = CLRJ</state>
        return x	## <state>x = CLRJ</state>
    else:
        return x[::-1]