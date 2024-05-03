def f(text, value):
    length = len(text)	## <state>length = CLRJ | text = CLRJ</state>
    letters = list(text)	## <state>letters = CLRJ | text = CLRJ</state>
    if value not in letters:	## <state>value = CLRJ | letters = CLRJ</state>
        value = letters[0]
    return value * length	## <state>value = CLRJ | length = CLRJ</state>
