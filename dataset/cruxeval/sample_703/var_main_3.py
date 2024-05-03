def f(text, char):
    count = text.count(char*2)	## <state>count = CLRJ | text = CLRJ | char = CLRJ</state>
    return text[count:]	## <state>text = CLRJ | count = CLRJ</state>
