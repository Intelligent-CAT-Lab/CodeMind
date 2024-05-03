def f(array):
    output = array.copy()	## output = CLRJ | array = CLRJ
    output[0::2] = output[-1::-2]	## output = CLRJ
    output.reverse()	## output = CLRJ
    return output	## output = CLRJ
