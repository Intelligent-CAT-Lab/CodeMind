def f(text, char):
    index = text.rindex(char)	## <state>index = CLRJ | text = CLRJ | char = CLRJ</state>
    result = list(text)	## <state>result = CLRJ | text = CLRJ</state>
    while index > 0:	## <state>index = CLRJ</state>
        result[index] = result[index-1]	## <state>result = CLRJ | index = CLRJ</state>
        result[index-1] = char	## <state>result = CLRJ | index = CLRJ | char = CLRJ</state>
        index -= 2	## <state>index = CLRJ</state>
    return ''.join(result)	## <state>result = CLRJ</state>
