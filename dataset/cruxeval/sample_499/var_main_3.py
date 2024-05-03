def f(text, length, fillchar):
    size = len(text)	## <state>size = CLRJ | text = CLRJ</state>
    return text.center(length, fillchar)	## <state>text = CLRJ | length = CLRJ | fillchar = CLRJ</state>
