def f(text, old, new):
    text2 = text.replace(old, new)	## <state>text2 = CLRJ | text = CLRJ | old = CLRJ | new = CLRJ</state>
    old2 = old[::-1]	## <state>old2 = CLRJ | old = CLRJ</state>
    while old2 in text2:	## <state>old2 = CLRJ | text2 = CLRJ</state>
        text2 = text2.replace(old2, new)
    return text2	## <state>text2 = CLRJ</state>
