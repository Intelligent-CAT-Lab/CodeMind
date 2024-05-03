def f(text, prefix):
    idx = 0	## idx = CLRJ
    for letter in prefix:	## letter = CLRJ | prefix = CLRJ
        if text[idx] != letter:	## text = CLRJ | idx = CLRJ | letter = CLRJ
            return None
        idx += 1	## idx = CLRJ
    return text[idx:]	## text = CLRJ | idx = CLRJ
