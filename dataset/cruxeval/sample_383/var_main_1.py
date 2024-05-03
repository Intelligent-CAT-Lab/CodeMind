def f(text, chars):
    result = list(text)	## result = CLRJ | text = CLRJ
    while chars in result[-3::-2]:	## chars = CLRJ | result = CLRJ
        result.remove(result[-3])
        result.remove(result[-3])
    return ''.join(result).strip('.')	## result = CLRJ
