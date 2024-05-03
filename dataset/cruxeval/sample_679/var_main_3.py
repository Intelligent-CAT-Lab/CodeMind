def f(text):
    if text == '':	## <state>text = CLRJ</state>
        return False
    first_char = text[0]	## <state>first_char = CLRJ | text = CLRJ</state>
    if text[0].isdigit():	## <state>text = CLRJ</state>
        return False
    for last_char in text:	## <state>last_char = CLRJ | text = CLRJ</state>
        if (last_char != '_') and not last_char.isidentifier():	## <state>last_char = CLRJ</state>
            return False
    return True