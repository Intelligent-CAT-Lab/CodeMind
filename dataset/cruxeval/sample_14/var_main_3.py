def f(s):
    arr = list(s.strip())	## <state>arr = CLRJ | s = CLRJ</state>
    arr.reverse()	## <state>arr = CLRJ</state>
    return ''.join(arr)	## <state>arr = CLRJ</state>
