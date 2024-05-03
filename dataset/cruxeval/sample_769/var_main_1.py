def f(text):
    text_list = [char for char in text]	## text_list = CLRJ | char = CLRJ | text = CLRJ
    for i, char in enumerate(text_list):	## i = CLRJ | char = CLRJ | text_list = CLRJ
        text_list[i] = char.swapcase()	## text_list = CLRJ | i = CLRJ | char = CLRJ
    return ''.join(text_list)	## text_list = CLRJ
