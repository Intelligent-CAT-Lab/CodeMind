def f(array):
    result = array.copy()	## <state>result = CLRJ | array = CLRJ</state>
    result.reverse()	## <state>result = CLRJ</state>
    result[:] = [item * 2 for item in result]	## <state>result = CLRJ | item = CLRJ</state>
    return result	## <state>result = CLRJ</state>
