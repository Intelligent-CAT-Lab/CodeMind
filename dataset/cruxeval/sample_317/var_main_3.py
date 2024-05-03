def f(text, a, b):
    text = text.replace(a, b)	## <state>text = CLRJ | a = CLRJ | b = CLRJ</state>
    return text.replace(b, a)	## <state>text = CLRJ | b = CLRJ | a = CLRJ</state>
