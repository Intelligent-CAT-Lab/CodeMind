def f(char_freq):
    result = {}	## <state>result = CLRJ</state>
    for k, v in char_freq.copy().items():	## <state>k = CLRJ | v = CLRJ | char_freq = CLRJ</state>
        result[k] = v // 2	## <state>result = CLRJ | k = CLRJ | v = CLRJ</state>
    return result	## <state>result = CLRJ</state>
