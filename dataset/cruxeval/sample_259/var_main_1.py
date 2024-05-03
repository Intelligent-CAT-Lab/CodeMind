def f(text):
    new_text = []	## new_text = CLRJ
    for character in text:	## character = CLRJ | text = CLRJ
        if character.isupper():	## character = CLRJ
            new_text.insert(len(new_text) // 2, character)	## new_text = CLRJ | character = CLRJ
    if len(new_text) == 0:	## new_text = CLRJ
        new_text = ['-']
    return ''.join(new_text)	## new_text = CLRJ
