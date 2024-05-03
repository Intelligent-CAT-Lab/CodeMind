def f(string):
    count = string.count(':')	## <state>count = CLRJ | string = CLRJ</state>
    return string.replace(':', '', count - 1)	## <state>string = CLRJ | count = CLRJ</state>
