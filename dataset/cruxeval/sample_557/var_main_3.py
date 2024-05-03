def f(str):
    d = str.rpartition('ar')	## <state>d = CLRJ | str = CLRJ</state>
    return ' '.join((d[0], d[1], d[2]))	## <state>d = CLRJ</state>
