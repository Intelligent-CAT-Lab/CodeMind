def f(char_map, text):
    new_text = ''	## <state>new_text = CLRJ</state>
    for ch in text:	## <state>ch = CLRJ | text = CLRJ</state>
        val = char_map.get(ch)	## <state>val = CLRJ | char_map = CLRJ | ch = CLRJ</state>
        if val is None:	## <state>val = CLRJ</state>
            new_text += ch	## <state>new_text = CLRJ | ch = CLRJ</state>
        else:
            new_text += val
    return new_text	## <state>new_text = CLRJ</state>
