def f(haystack, needle):
    for i in range(haystack.find(needle), -1, -1):	## i = CLRJ | haystack = CLRJ | needle = CLRJ
        if haystack[i:] == needle:	## haystack = CLRJ | i = CLRJ | needle = CLRJ
            return i
    return -1