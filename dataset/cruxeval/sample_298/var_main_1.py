def f(text):
    new_text = list(text)	## new_text = CLRJ | text = CLRJ
    for i in range(len(new_text)):	## i = CLRJ | new_text = CLRJ
        character = new_text[i]	## character = CLRJ | new_text = CLRJ | i = CLRJ
        new_character = character.swapcase()	## new_character = CLRJ | character = CLRJ
        new_text[i] = new_character	## new_text = CLRJ | i = CLRJ | new_character = CLRJ
    return ''.join(new_text)	## new_text = CLRJ
