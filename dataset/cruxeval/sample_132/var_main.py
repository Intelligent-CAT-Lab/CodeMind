def f(a_str, prefix):
    if a_str.removeprefix(prefix):	## {"a_str" : '',"prefix" : ''}
        return a_str
    else:
        return prefix + a_str