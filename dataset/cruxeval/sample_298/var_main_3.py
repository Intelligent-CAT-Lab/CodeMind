def f(text):
    new_text = list(text)	## <state>new_text = CLRJ | text = CLRJ</state>
    for i in range(len(new_text)):	## <state>i = CLRJ | new_text = CLRJ</state>
        character = new_text[i]	## <state>character = CLRJ | new_text = CLRJ | i = CLRJ</state>
        new_character = character.swapcase()	## <state>new_character = CLRJ | character = CLRJ</state>
        new_text[i] = new_character	## <state>new_text = CLRJ | i = CLRJ | new_character = CLRJ</state>
    return ''.join(new_text)	## <state>new_text = CLRJ</state>
