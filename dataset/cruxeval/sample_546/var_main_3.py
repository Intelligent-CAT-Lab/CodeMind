def f(text, speaker):
    while text.startswith(speaker):	## <state>text = CLRJ | speaker = CLRJ</state>
        text = text[len(speaker):]	## <state>text = CLRJ | speaker = CLRJ</state>
    return text	## <state>text = CLRJ</state>
