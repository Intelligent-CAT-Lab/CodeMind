def f(text, chars):
    result = list(text)	## <state>result = CLRJ | text = CLRJ</state>
    while chars in result[-3::-2]:	## <state>chars = CLRJ | result = CLRJ</state>
        result.remove(result[-3])
        result.remove(result[-3])
    return ''.join(result).strip('.')	## <state>result = CLRJ</state>
