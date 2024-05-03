def f(text, char):
    position = len(text)	## <state>position = CLRJ | text = CLRJ</state>
    if char in text:	## <state>char = CLRJ | text = CLRJ</state>
        position = text.index(char)	## <state>position = CLRJ | text = CLRJ | char = CLRJ</state>
        if position > 1:	## <state>position = CLRJ</state>
            position = (position + 1) % len(text)
    return position	## <state>position = CLRJ</state>
