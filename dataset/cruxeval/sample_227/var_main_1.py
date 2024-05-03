def f(text):
    text = text.lower()	## text = CLRJ
    head, tail = text[0], text[1:]	## head = CLRJ | tail = CLRJ | text = CLRJ
    return head.upper() + tail	## head = CLRJ | tail = CLRJ
