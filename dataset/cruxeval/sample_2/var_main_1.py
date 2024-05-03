def f(text):
    new_text = list(text)	## new_text = CLRJ | text = CLRJ
    for i in '+':	## i = CLRJ
        if i in new_text:	## i = CLRJ | new_text = CLRJ
            new_text.remove(i)
    return ''.join(new_text)	## new_text = CLRJ
