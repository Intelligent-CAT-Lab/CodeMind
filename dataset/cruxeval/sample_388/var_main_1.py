def f(text, characters):
    character_list = list(characters) + [' ', '_']	## character_list = CLRJ | characters = CLRJ

    i = 0	## i = CLRJ
    while i < len(text) and text[i] in character_list:	## i = CLRJ | text = CLRJ | character_list = CLRJ
        i += 1

    return text[i:]	## text = CLRJ | i = CLRJ
