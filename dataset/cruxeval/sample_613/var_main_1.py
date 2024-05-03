def f(text):
    result = ''	## result = CLRJ
    mid = (len(text) - 1) // 2	## mid = CLRJ | text = CLRJ
    for i in range(mid):	## i = CLRJ | mid = CLRJ
        result += text[i]	## result = CLRJ | text = CLRJ | i = CLRJ
    for i in range(mid, len(text)-1):	## i = CLRJ | mid = CLRJ | text = CLRJ
        result += text[mid + len(text) - 1 - i]	## result = CLRJ | text = CLRJ | mid = CLRJ | i = CLRJ
    return result.ljust(len(text), text[-1])	## result = CLRJ | text = CLRJ
