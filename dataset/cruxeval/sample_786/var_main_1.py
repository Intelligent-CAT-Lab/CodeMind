def f(text, letter):
    if letter in text:	## letter = CLRJ | text = CLRJ
        start = text.index(letter)	## start = CLRJ | text = CLRJ | letter = CLRJ
        return text[start + 1:] + text[:start + 1]	## text = CLRJ | start = CLRJ
    return text