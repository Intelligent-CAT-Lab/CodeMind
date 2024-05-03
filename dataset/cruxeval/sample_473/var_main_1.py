def f(text, value):
    indexes = list()	## indexes = CLRJ
    for i in range(len(text)):	## i = CLRJ | text = CLRJ
        if text[i] == value:	## text = CLRJ | i = CLRJ | value = CLRJ
            indexes.append(i)	## indexes = CLRJ | i = CLRJ
    new_text = list(text)	## new_text = CLRJ | text = CLRJ
    for i in indexes:	## i = CLRJ | indexes = CLRJ
        new_text.remove(value)	## new_text = CLRJ | value = CLRJ
    return ''.join(new_text)	## new_text = CLRJ
