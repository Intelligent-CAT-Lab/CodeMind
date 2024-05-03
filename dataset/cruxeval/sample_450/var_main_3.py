def f(strs):
    strs = strs.split()	## <state>strs = CLRJ</state>
    for i in range(1, len(strs), 2):	## <state>i = CLRJ | strs = CLRJ</state>
        strs[i] = ''.join(reversed(strs[i]))	## <state>strs = CLRJ | i = CLRJ</state>
    return ' '.join(strs)	## <state>strs = CLRJ</state>
