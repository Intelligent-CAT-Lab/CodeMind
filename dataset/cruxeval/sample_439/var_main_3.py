def f(value):
    parts = value.partition(' ')[::2]	## <state>parts = CLRJ | value = CLRJ</state>
    return ''.join(parts)	## <state>parts = CLRJ</state>
