def f(text):
    text_list = [char for char in text]	## <state>text_list = CLRJ | char = CLRJ | text = CLRJ</state>
    for i, char in enumerate(text_list):	## <state>i = CLRJ | char = CLRJ | text_list = CLRJ</state>
        text_list[i] = char.swapcase()	## <state>text_list = CLRJ | i = CLRJ | char = CLRJ</state>
    return ''.join(text_list)	## <state>text_list = CLRJ</state>
