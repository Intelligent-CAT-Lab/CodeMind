def f(text, char):
    if not text.endswith(char):	## <state>text = CLRJ | char = CLRJ</state>
        return f(char + text, char)
    return text	## <state>text = CLRJ</state>
