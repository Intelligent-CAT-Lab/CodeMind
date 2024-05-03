field = 0

def f(text):
    global g, field
    field = text.replace(' ', '')	## <state>text = CLRJ</state>
    g = text.replace('0', ' ')	## <state>text = CLRJ</state>
    text = text.replace('1', 'i')	## <state>text = CLRJ</state>

    return text	## <state>text = CLRJ</state>
