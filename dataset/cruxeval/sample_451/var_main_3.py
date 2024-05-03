def f(text, char):
    text = list(text)	## <state>text = CLRJ</state>
    for count, item in enumerate(text):	## <state>count = CLRJ | item = CLRJ | text = CLRJ</state>
        if item == char:	## <state>item = CLRJ | char = CLRJ</state>
            text.remove(item)	## <state>text = CLRJ | item = CLRJ</state>
            return ''.join(text)	## <state>text = CLRJ</state>
    return text