def f(text, letter):
    if letter in text:	## <state>letter = CLRJ | text = CLRJ</state>
        start = text.index(letter)	## <state>start = CLRJ | text = CLRJ | letter = CLRJ</state>
        return text[start + 1:] + text[:start + 1]	## <state>text = CLRJ | start = CLRJ</state>
    return text