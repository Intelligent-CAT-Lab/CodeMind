def f(text, char):
    if char in text:	## <state>char = CLRJ | text = CLRJ</state>
        text = [t.strip() for t in text.split(char) if t]	## <state>text = CLRJ | t = CLRJ | char = CLRJ</state>
        if len(text) > 1:	## <state>text = CLRJ</state>
            return True
    return False