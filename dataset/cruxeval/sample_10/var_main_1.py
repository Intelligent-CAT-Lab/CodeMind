def f(text):
    new_text = ''	## new_text = CLRJ
    for ch in text.lower().strip():	## text = CLRJ
        if ch.isnumeric() or ch in 'ÄäÏïÖöÜü':
            new_text += ch
    return new_text	## new_text = CLRJ
