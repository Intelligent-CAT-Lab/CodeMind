def f(text):
    result = []	## result = CLRJ
    for i in range(len(text)):	## i = CLRJ | text = CLRJ
        if not text[i].isascii():	## text = CLRJ | i = CLRJ
            return False
        elif text[i].isalnum():	## text = CLRJ | i = CLRJ
            result.append(text[i].upper())	## result = CLRJ | text = CLRJ | i = CLRJ
        else:
            result.append(text[i])
    return ''.join(result)	## result = CLRJ
