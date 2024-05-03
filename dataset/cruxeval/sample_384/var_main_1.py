def f(text, chars):
    chars = list(chars)	## chars = CLRJ
    text = list(text)	## text = CLRJ
    new_text = text	## new_text = CLRJ | text = CLRJ
    while len(new_text) > 0 and text:	## new_text = CLRJ | text = CLRJ
        if new_text[0] in chars:	## new_text = CLRJ | chars = CLRJ
            new_text = new_text[1:]	## new_text = CLRJ
        else:
            break 
    return ''.join(new_text)	## new_text = CLRJ
