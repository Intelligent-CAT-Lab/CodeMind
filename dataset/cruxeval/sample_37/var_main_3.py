def f(text):
    text_arr = []	## <state>text_arr = CLRJ</state>
    for j in range(len(text)):	## <state>j = CLRJ | text = CLRJ</state>
        text_arr.append(text[j:])	## <state>text_arr = CLRJ | text = CLRJ | j = CLRJ</state>
    return text_arr	## <state>text_arr = CLRJ</state>
