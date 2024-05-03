def f(text, chars):
    chars = list(chars)	## <state>chars = CLRJ</state>
    text = list(text)	## <state>text = CLRJ</state>
    new_text = text	## <state>new_text = CLRJ | text = CLRJ</state>
    while len(new_text) > 0 and text:	## <state>new_text = CLRJ | text = CLRJ</state>
        if new_text[0] in chars:	## <state>new_text = CLRJ | chars = CLRJ</state>
            new_text = new_text[1:]	## <state>new_text = CLRJ</state>
        else:
            break 
    return ''.join(new_text)	## <state>new_text = CLRJ</state>
