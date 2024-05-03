def f(arr):
    result = []	## {"result" : ''}
    for item in arr:	## {"item" : '',"arr" : ''}
        try:
            if item.isnumeric():	## {"item" : ''}
                result.append(int(item)*2)	## {"result" : '',"item" : ''}
        except ValueError:
            result.append(item[::-1])
    return result	## {"result" : ''}
