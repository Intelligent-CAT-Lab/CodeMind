def f(text, char):
    index = text.rindex(char)	## index = CLRJ | text = CLRJ | char = CLRJ
    result = list(text)	## result = CLRJ | text = CLRJ
    while index > 0:	## index = CLRJ
        result[index] = result[index-1]	## result = CLRJ | index = CLRJ
        result[index-1] = char	## result = CLRJ | index = CLRJ | char = CLRJ
        index -= 2	## index = CLRJ
    return ''.join(result)	## result = CLRJ
