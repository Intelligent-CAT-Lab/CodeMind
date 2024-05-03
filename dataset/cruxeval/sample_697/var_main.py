def f(s, sep):
    sep_index = s.find(sep)	## {"sep_index" : '',"s" : '',"sep" : ''}
    prefix = s[:sep_index]	## {"prefix" : '',"s" : '',"sep_index" : ''}
    middle = s[sep_index:sep_index + len(sep)]	## {"middle" : '',"s" : '',"sep_index" : '',"sep" : ''}
    right_str = s[sep_index + len(sep):]	## {"right_str" : '',"s" : '',"sep_index" : '',"sep" : ''}
    return prefix, middle, right_str	## {"prefix" : '',"middle" : '',"right_str" : ''}
