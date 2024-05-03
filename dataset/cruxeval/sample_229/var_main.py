def f(dic, value):
    result = []	## {"result" : ''}
    for e in dic:	## {"e" : '',"dic" : ''}
        result.append(e[0])	## {"result" : '',"e" : ''}
        if e[1] == value:	## {"e" : '',"value" : ''}
            result.reverse()
        else:
            result.append(e[1])	## {"result" : '',"e" : ''}
    return result	## {"result" : ''}
