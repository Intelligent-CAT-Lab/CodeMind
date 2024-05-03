def f(s, ch):
    if ch not in s:	## ch = CLRJ | s = CLRJ
        return ''
    s = s.partition(ch)[2][::-1]	## s = CLRJ | ch = CLRJ
    for i in range(len(s)):	## s = CLRJ
        s = s.partition(ch)[2][::-1]
    return s	## s = CLRJ
