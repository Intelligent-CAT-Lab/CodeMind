def f(s, separator):
    for i in range(len(s)):	## i = CLRJ | s = CLRJ
        if s[i] == separator:	## s = CLRJ | i = CLRJ | separator = CLRJ
            new_s = list(s)	## new_s = CLRJ | s = CLRJ
            new_s[i] = '/'	## new_s = CLRJ | i = CLRJ
            return ' '.join(new_s)	## new_s = CLRJ
