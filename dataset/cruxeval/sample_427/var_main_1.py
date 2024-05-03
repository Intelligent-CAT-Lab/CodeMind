def f(s):
    count = len(s) - 1	## count = CLRJ | s = CLRJ
    reverse_s = s[::-1]	## reverse_s = CLRJ | s = CLRJ
    while count > 0 and reverse_s[::2].rfind('sea') == -1:	## count = CLRJ | reverse_s = CLRJ
        count -= 1	## count = CLRJ
        reverse_s = reverse_s[:count]	## reverse_s = CLRJ | count = CLRJ
    return reverse_s[count:]	## reverse_s = CLRJ | count = CLRJ
