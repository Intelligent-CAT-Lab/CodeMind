def f(text, elem):
    if elem != '':	## <state>elem = CLRJ</state>
        while text.startswith(elem):	## <state>text = CLRJ | elem = CLRJ</state>
            text = text.replace(elem, '')
        while elem.startswith(text):	## <state>elem = CLRJ | text = CLRJ</state>
            elem = elem.replace(text, '')
    return [elem, text]	## <state>elem = CLRJ | text = CLRJ</state>
