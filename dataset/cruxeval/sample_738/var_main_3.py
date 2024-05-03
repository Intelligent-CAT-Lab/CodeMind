def f(text, characters):
    for i in range(len(characters)):	## <state>i = CLRJ | characters = CLRJ</state>
        text = text.rstrip(characters[i::len(characters)])	## <state>text = CLRJ | characters = CLRJ | i = CLRJ</state>
    return text	## <state>text = CLRJ</state>
