def f(text):
    new_text = []	## <state>new_text = CLRJ</state>
    for character in text:	## <state>character = CLRJ | text = CLRJ</state>
        if character.isupper():	## <state>character = CLRJ</state>
            new_text.insert(len(new_text) // 2, character)	## <state>new_text = CLRJ | character = CLRJ</state>
    if len(new_text) == 0:	## <state>new_text = CLRJ</state>
        new_text = ['-']
    return ''.join(new_text)	## <state>new_text = CLRJ</state>
