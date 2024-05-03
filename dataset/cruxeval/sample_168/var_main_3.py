def f(text, new_value, index):
    key = text.maketrans(text[index], new_value)	## <state>key = CLRJ | text = CLRJ | index = CLRJ | new_value = CLRJ</state>
    return text.translate(key)	## <state>text = CLRJ | key = CLRJ</state>
