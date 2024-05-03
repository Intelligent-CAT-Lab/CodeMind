def f(haystack, needle):
    for i in range(haystack.find(needle), -1, -1):	## <state>i = CLRJ | haystack = CLRJ | needle = CLRJ</state>
        if haystack[i:] == needle:	## <state>haystack = CLRJ | i = CLRJ | needle = CLRJ</state>
            return i
    return -1