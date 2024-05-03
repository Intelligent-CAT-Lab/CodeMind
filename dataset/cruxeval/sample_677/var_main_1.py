def f(text, length):
    length = -length if length < 0 else length	## length = CLRJ
    output = ''	## output = CLRJ
    for idx in range(length):	## idx = CLRJ | length = CLRJ
        if text[idx % len(text)] != ' ':	## text = CLRJ | idx = CLRJ
            output += text[idx % len(text)]	## output = CLRJ | text = CLRJ | idx = CLRJ
        else:
            break
    return output	## output = CLRJ
