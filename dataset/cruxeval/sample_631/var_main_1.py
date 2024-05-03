def f(text, num):
    req = num - len(text)	## req = CLRJ | num = CLRJ | text = CLRJ
    text = text.center(num, '*')	## text = CLRJ | num = CLRJ
    return text[:req // 2: -req // 2]	## text = CLRJ | req = CLRJ
