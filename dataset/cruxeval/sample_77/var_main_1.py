def f(text, character):
    subject = text[text.rfind(character):]	## subject = CLRJ | text = CLRJ | character = CLRJ
    return subject*text.count(character)	## subject = CLRJ | text = CLRJ | character = CLRJ
