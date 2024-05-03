def f(s, sep):
    sep_index = s.find(sep)	## sep_index = CLRJ | s = CLRJ | sep = CLRJ
    prefix = s[:sep_index]	## prefix = CLRJ | s = CLRJ | sep_index = CLRJ
    middle = s[sep_index:sep_index + len(sep)]	## middle = CLRJ | s = CLRJ | sep_index = CLRJ | sep = CLRJ
    right_str = s[sep_index + len(sep):]	## right_str = CLRJ | s = CLRJ | sep_index = CLRJ | sep = CLRJ
    return prefix, middle, right_str	## prefix = CLRJ | middle = CLRJ | right_str = CLRJ
