def f(char_map, text):
    new_text = ''	## new_text = CLRJ
    for ch in text:	## ch = CLRJ | text = CLRJ
        val = char_map.get(ch)	## val = CLRJ | char_map = CLRJ | ch = CLRJ
        if val is None:	## val = CLRJ
            new_text += ch	## new_text = CLRJ | ch = CLRJ
        else:
            new_text += val
    return new_text	## new_text = CLRJ
