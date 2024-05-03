def f(values):
    names = ['Pete', 'Linda', 'Angela']	## <state>names = CLRJ</state>
    names.extend(values)	## <state>names = CLRJ | values = CLRJ</state>
    names.sort()	## <state>names = CLRJ</state>
    return names	## <state>names = CLRJ</state>
