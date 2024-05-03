def f(array, const):
    output = ['x']	## <state>output = CLRJ</state>
    for i in range(1, len(array) + 1):	## <state>i = CLRJ | array = CLRJ</state>
        if i % 2 != 0:	## <state>i = CLRJ</state>
            output.append(array[i - 1] * -2)	## <state>output = CLRJ | array = CLRJ | i = CLRJ</state>
        else:
            output.append(const)	## <state>output = CLRJ | const = CLRJ</state>
    return output	## <state>output = CLRJ</state>
