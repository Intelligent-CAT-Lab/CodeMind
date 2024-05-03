def f(s, sep):
    reverse = ['*' + e for e in s.split(sep)]	## {"reverse" : '',"e" : '',"s" : '',"sep" : ''}
    return ';'.join(reversed(reverse))	## {"reverse" : ''}
