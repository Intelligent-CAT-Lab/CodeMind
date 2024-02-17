def f(s, sep):
    sep_index = s.find(sep)
    prefix = s[:sep_index]
    middle = s[sep_index:sep_index + len(sep)]
    right_str = s[sep_index + len(sep):]
    return prefix, middle, right_str