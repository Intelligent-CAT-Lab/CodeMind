def f(text, char):
    if text:	## <state>text = CLRJ</state>
        text = text.removeprefix(char)	## <state>text = CLRJ | char = CLRJ</state>
        text = text.removeprefix(text[-1])
        text = text[:-1] + text[-1].capitalize()
    return text