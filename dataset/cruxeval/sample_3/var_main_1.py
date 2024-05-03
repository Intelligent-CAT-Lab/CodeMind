def f(text, value):
    text_list = list(text)	## text_list = CLRJ | text = CLRJ
    text_list.append(value)	## text_list = CLRJ | value = CLRJ
    return ''.join(text_list)	## text_list = CLRJ
