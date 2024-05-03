def f(text):
    if text == '':	## text = CLRJ
        return False
    first_char = text[0]	## first_char = CLRJ | text = CLRJ
    if text[0].isdigit():	## text = CLRJ
        return False
    for last_char in text:	## last_char = CLRJ | text = CLRJ
        if (last_char != '_') and not last_char.isidentifier():	## last_char = CLRJ
            return False
    return True