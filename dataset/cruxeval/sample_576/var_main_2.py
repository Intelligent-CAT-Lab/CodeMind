def f(array, const):
    output = ['x']	## output = []
    for i in range(1, len(array) + 1):	## i = [] | array = []
        if i % 2 != 0:	## i = []
            output.append(array[i - 1] * -2)	## output = [] | array = [] | i = []
        else:
            output.append(const)	## output = [] | const = []
    return output	## output = []
