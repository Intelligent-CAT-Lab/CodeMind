def f(text):
    values = text.split()	## <state>values = CLRJ | text = CLRJ</state>
    return '${first}y, ${second}x, ${third}r, ${fourth}p' % dict({
        'first': values[0],	## <state>values = CLRJ</state>
        'second': values[1],	## <state>values = CLRJ</state>
        'third': values[2],	## <state>values = CLRJ</state>
        'fourth': values[3]	## <state>values = CLRJ</state>
    })