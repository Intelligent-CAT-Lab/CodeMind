def f(array):
    s = ' '	## <state>s = CLRJ</state>
    s += ''.join(array)	## <state>s = CLRJ | array = CLRJ</state>
    return s	## <state>s = CLRJ</state>
