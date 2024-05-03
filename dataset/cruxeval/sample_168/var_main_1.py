def f(text, new_value, index):
    key = text.maketrans(text[index], new_value)	## key = CLRJ | text = CLRJ | index = CLRJ | new_value = CLRJ
    return text.translate(key)	## text = CLRJ | key = CLRJ
