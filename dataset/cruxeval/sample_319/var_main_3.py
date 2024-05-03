def f(needle, haystack):
    count = 0	## <state>count = CLRJ</state>
    while needle in haystack:	## <state>needle = CLRJ | haystack = CLRJ</state>
        haystack = haystack.replace(needle, '', 1)	## <state>haystack = CLRJ | needle = CLRJ</state>
        count += 1	## <state>count = CLRJ</state>
    return count	## <state>count = CLRJ</state>
