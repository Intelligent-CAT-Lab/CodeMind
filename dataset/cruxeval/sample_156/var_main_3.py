def f(text, limit, char):
    if limit < len(text):	## <state>limit = CLRJ | text = CLRJ</state>
        return text[0:limit]
    return text.ljust(limit, char)	## <state>text = CLRJ | limit = CLRJ | char = CLRJ</state>
