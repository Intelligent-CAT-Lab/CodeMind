def f(text, chars):
    num_applies = 2	## <state>num_applies = CLRJ</state>
    extra_chars = ''	## <state>extra_chars = CLRJ</state>
    for i in range(num_applies):	## <state>i = CLRJ | num_applies = CLRJ</state>
        extra_chars += chars	## <state>extra_chars = CLRJ | chars = CLRJ</state>
        text = text.replace(extra_chars, '')	## <state>text = CLRJ | extra_chars = CLRJ</state>
    return text	## <state>text = CLRJ</state>
