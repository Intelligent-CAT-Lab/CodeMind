def f(array):
    output = array.copy()	## {"output" : '',"array" : ''}
    output[0::2] = output[-1::-2]	## {"output" : ''}
    output.reverse()	## {"output" : ''}
    return output	## {"output" : ''}
