def f(text):
    valid_chars = ['-', '_', '+', '.', '/', ' ']	## <state>valid_chars = CLRJ</state>
    text = text.upper()	## <state>text = CLRJ</state>
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        if char.isalnum() == False and char not in valid_chars:	## <state>char = CLRJ | valid_chars = CLRJ</state>
            return False
    return True