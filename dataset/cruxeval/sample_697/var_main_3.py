def f(s, sep):
    sep_index = s.find(sep)	## <state>sep_index = CLRJ | s = CLRJ | sep = CLRJ</state>
    prefix = s[:sep_index]	## <state>prefix = CLRJ | s = CLRJ | sep_index = CLRJ</state>
    middle = s[sep_index:sep_index + len(sep)]	## <state>middle = CLRJ | s = CLRJ | sep_index = CLRJ | sep = CLRJ</state>
    right_str = s[sep_index + len(sep):]	## <state>right_str = CLRJ | s = CLRJ | sep_index = CLRJ | sep = CLRJ</state>
    return prefix, middle, right_str	## <state>prefix = CLRJ | middle = CLRJ | right_str = CLRJ</state>
