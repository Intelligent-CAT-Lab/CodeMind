def f(text):
    text = text.lower()	## text = CLRJ
    capitalize = text.capitalize()	## capitalize = CLRJ | text = CLRJ
    return text[:1] + capitalize[1:]	## text = CLRJ | capitalize = CLRJ
