def f(string):
    if string[:4] != 'Nuva':	## <state>string = CLRJ</state>
        return 'no'
    else:
        return string.rstrip()	## <state>string = CLRJ</state>
