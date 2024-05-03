def f(text, chars):
    listchars = list(chars)	## <state>listchars = CLRJ | chars = CLRJ</state>
    first = listchars.pop()	## <state>first = CLRJ | listchars = CLRJ</state>
    for i in listchars:	## <state>listchars = CLRJ</state>
        text = text[0:text.find(i)]+i+text[text.find(i)+1:]
    return text	## <state>text = CLRJ</state>
