def f(text, sep, maxsplit):
    splitted = text.rsplit(sep, maxsplit)	## splitted = CLRJ | text = CLRJ | sep = CLRJ | maxsplit = CLRJ
    length = len(splitted)	## length = CLRJ | splitted = CLRJ
    new_splitted = splitted[:length // 2]	## new_splitted = CLRJ | splitted = CLRJ | length = CLRJ
    new_splitted.reverse()	## new_splitted = CLRJ
    new_splitted += splitted[length // 2:]	## new_splitted = CLRJ | splitted = CLRJ | length = CLRJ
    return sep.join(new_splitted)	## sep = CLRJ | new_splitted = CLRJ
