def f(text):
    new_text = [c if c.isdigit() else '*' for c in text]	## new_text = CLRJ | c = CLRJ | text = CLRJ
    return ''.join(new_text)	## new_text = CLRJ
