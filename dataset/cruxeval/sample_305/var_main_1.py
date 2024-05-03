def f(text, char):
    length = len(text)	## length = CLRJ | text = CLRJ
    index = -1	## index = CLRJ
    for i in range(length):	## i = CLRJ | length = CLRJ
        if text[i] == char:	## text = CLRJ | i = CLRJ | char = CLRJ
            index = i	## index = CLRJ | i = CLRJ
    if index == -1:	## index = CLRJ
        index = length // 2
    new_text = list(text)	## new_text = CLRJ | text = CLRJ
    new_text.pop(index)	## new_text = CLRJ | index = CLRJ
    return ''.join(new_text)	## new_text = CLRJ
