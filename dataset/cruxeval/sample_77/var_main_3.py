def f(text, character):
    subject = text[text.rfind(character):]	## <state>subject = CLRJ | text = CLRJ | character = CLRJ</state>
    return subject*text.count(character)	## <state>subject = CLRJ | text = CLRJ | character = CLRJ</state>
