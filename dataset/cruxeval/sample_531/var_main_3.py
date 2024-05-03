def f(text, x):
    if text.removeprefix(x) == text:	## <state>text = CLRJ | x = CLRJ</state>
        return f(text[1:], x)
    else:
        return text