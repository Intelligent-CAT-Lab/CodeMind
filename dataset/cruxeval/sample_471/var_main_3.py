def f(val, text):
    indices = [index for index in range(len(text)) if text[index] == val]	## <state>indices = CLRJ | index = CLRJ | text = CLRJ | val = CLRJ</state>
    if len(indices) == 0:	## <state>indices = CLRJ</state>
        return -1
    else:
        return indices[0]