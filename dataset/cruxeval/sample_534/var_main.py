def f(sequence, value):
    i = max(sequence.index(value) - len(sequence) // 3, 0)	## {"i" : '',"sequence" : '',"value" : ''}
    result = ''	## {"result" : ''}
    for j, v in enumerate(sequence[i:]):	## {"j" : '',"v" : '',"sequence" : '',"i" : ''}
        if v == '+':	## {"v" : ''}
            result += value
        else:
            result += sequence[i + j]	## {"result" : '',"sequence" : '',"i" : '',"j" : ''}
    return result	## {"result" : ''}
