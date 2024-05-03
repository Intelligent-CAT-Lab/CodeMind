def f(text, new_ending):
    result = list(text)	## {"result" : '',"text" : ''}
    result.extend(new_ending)	## {"result" : '',"new_ending" : ''}
    return ''.join(result)	## {"result" : ''}
