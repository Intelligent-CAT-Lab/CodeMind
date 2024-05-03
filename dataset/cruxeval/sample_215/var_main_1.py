def f(text):
    new_text = text	## new_text = CLRJ | text = CLRJ
    while len(text) > 1 and text[0] == text[-1]:	## text = CLRJ
        new_text = text = text[1:-1]
    return new_text	## new_text = CLRJ
