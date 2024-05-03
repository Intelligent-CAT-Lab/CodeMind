def f(text):
    new_text = text	## <state>new_text = CLRJ | text = CLRJ</state>
    while len(text) > 1 and text[0] == text[-1]:	## <state>text = CLRJ</state>
        new_text = text = text[1:-1]
    return new_text	## <state>new_text = CLRJ</state>
