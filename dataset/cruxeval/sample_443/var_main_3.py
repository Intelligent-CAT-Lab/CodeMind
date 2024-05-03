def f(text):
    for space in text:	## <state>space = CLRJ | text = CLRJ</state>
        if space == ' ':	## <state>space = CLRJ</state>
            text = text.lstrip()	## <state>text = CLRJ</state>
        else:
            text = text.replace('cd', space)	## <state>text = CLRJ | space = CLRJ</state>
    return text	## <state>text = CLRJ</state>
