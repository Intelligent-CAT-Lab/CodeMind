def f(text):
    new_text = [c if c.isdigit() else '*' for c in text]	## <state>new_text = CLRJ | c = CLRJ | text = CLRJ</state>
    return ''.join(new_text)	## <state>new_text = CLRJ</state>
