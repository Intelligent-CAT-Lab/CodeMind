def f(text):
    if text.istitle():	## <state>text = CLRJ</state>
        if len(text) > 1 and text.lower() != text:
            return text[0].lower() + text[1:]
    elif text.isalpha():	## <state>text = CLRJ</state>
        return text.capitalize()
    return text	## <state>text = CLRJ</state>
