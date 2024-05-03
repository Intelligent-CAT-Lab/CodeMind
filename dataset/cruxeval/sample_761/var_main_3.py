def f(array):
    output = array.copy()	## <state>output = CLRJ | array = CLRJ</state>
    output[0::2] = output[-1::-2]	## <state>output = CLRJ</state>
    output.reverse()	## <state>output = CLRJ</state>
    return output	## <state>output = CLRJ</state>
