def f(text):
    text = text.lower()	## <state>text = CLRJ</state>
    capitalize = text.capitalize()	## <state>capitalize = CLRJ | text = CLRJ</state>
    return text[:1] + capitalize[1:]	## <state>text = CLRJ | capitalize = CLRJ</state>
