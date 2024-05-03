def f(text, characters):
    for i in range(len(characters)):	## i = CLRJ | characters = CLRJ
        text = text.rstrip(characters[i::len(characters)])	## text = CLRJ | characters = CLRJ | i = CLRJ
    return text	## text = CLRJ
