def f(text, search_chars, replace_chars):
    trans_table = str.maketrans(search_chars, replace_chars)	## trans_table = CLRJ | search_chars = CLRJ | replace_chars = CLRJ
    return text.translate(trans_table)	## text = CLRJ | trans_table = CLRJ
