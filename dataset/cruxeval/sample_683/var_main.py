def f(dict1, dict2):
    result = dict1.copy()	## {"result" : '',"dict1" : ''}
    result.update([(__, dict2[__]) for __ in dict2])	## {"result" : '',"__" : '',"dict2" : ''}
    return result	## {"result" : ''}
