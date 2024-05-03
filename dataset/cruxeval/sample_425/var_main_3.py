def f(a):
    a = a.replace('/', ':')	## <state>a = CLRJ</state>
    z = a.rpartition(':')	## <state>z = CLRJ | a = CLRJ</state>
    return [z[0], z[1], z[2]]	## <state>z = CLRJ</state>
