def f(text, value):
    text_list = list(text)	## <state>text_list = CLRJ | text = CLRJ</state>
    text_list.append(value)	## <state>text_list = CLRJ | value = CLRJ</state>
    return ''.join(text_list)	## <state>text_list = CLRJ</state>
