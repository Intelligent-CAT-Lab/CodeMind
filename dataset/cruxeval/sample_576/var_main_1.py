def f(array, const):
    output = ['x']	## output = CLRJ
    for i in range(1, len(array) + 1):	## i = CLRJ | array = CLRJ
        if i % 2 != 0:	## i = CLRJ
            output.append(array[i - 1] * -2)	## output = CLRJ | array = CLRJ | i = CLRJ
        else:
            output.append(const)	## output = CLRJ | const = CLRJ
    return output	## output = CLRJ
