def f(text):
    out = ""	## out = CLRJ
    for i in range(len(text)):	## i = CLRJ | text = CLRJ
        if text[i].isupper():	## text = CLRJ | i = CLRJ
            out += text[i].lower()	## out = CLRJ | text = CLRJ | i = CLRJ
        else:
            out += text[i].upper()	## out = CLRJ | text = CLRJ | i = CLRJ
    return out	## out = CLRJ
