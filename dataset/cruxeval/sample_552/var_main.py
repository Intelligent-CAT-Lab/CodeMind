def f(d):
    result = {}	## {"result" : ''}
    for k, v in d.items():	## {"k" : '',"v" : '',"d" : ''}
        if isinstance(k, float):	## {"k" : ''}
            for i in v:
                result[i] = k
        else:
            result[k] = v	## {"result" : '',"k" : '',"v" : ''}
    return result	## {"result" : ''}
