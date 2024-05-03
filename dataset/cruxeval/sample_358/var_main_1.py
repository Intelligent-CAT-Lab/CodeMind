def f(text, value):
    indexes = []	## indexes = CLRJ
    for i in range(len(text)):	## i = CLRJ | text = CLRJ
        if text[i] == value and (i == 0 or text[i-1] != value):	## text = CLRJ | i = CLRJ | value = CLRJ
            indexes.append(i) 	## indexes = CLRJ | i = CLRJ
    if len(indexes) % 2 == 1:	## indexes = CLRJ
        return text
    return text[indexes[0]+1:indexes[-1]]	## text = CLRJ | indexes = CLRJ
