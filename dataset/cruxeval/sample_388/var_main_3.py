def f(text, characters):
    character_list = list(characters) + [' ', '_']	## <state>character_list = CLRJ | characters = CLRJ</state>

    i = 0	## <state>i = CLRJ</state>
    while i < len(text) and text[i] in character_list:	## <state>i = CLRJ | text = CLRJ | character_list = CLRJ</state>
        i += 1

    return text[i:]	## <state>text = CLRJ | i = CLRJ</state>
