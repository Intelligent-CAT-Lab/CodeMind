def f(dict):
    result = dict.copy()	## <state>result = CLRJ | dict = CLRJ</state>
    remove_keys = []	## <state>remove_keys = CLRJ</state>
    for k, v in dict.items():	## <state>k = CLRJ | v = CLRJ | dict = CLRJ</state>
        if v in dict:	## <state>v = CLRJ | dict = CLRJ</state>
            del result[k]	## <state>result = CLRJ | k = CLRJ</state>
    return result	## <state>result = CLRJ</state>
