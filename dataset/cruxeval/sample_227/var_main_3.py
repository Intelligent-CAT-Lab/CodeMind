def f(text):
    text = text.lower()	## <state>text = CLRJ</state>
    head, tail = text[0], text[1:]	## <state>head = CLRJ | tail = CLRJ | text = CLRJ</state>
    return head.upper() + tail	## <state>head = CLRJ | tail = CLRJ</state>
