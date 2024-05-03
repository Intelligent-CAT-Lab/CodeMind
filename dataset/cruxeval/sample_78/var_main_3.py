def f(text):
    if text and text.isupper():	## <state>text = CLRJ</state>
        cs = str.maketrans(string.ascii_uppercase, string.ascii_lowercase)
        return text.translate(cs)
    return text.lower()[:3]	## <state>text = CLRJ</state>
