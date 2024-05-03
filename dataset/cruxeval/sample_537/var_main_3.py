def f(text, value):
    new_text = list(text)	## <state>new_text = CLRJ | text = CLRJ</state>
    try:
        new_text.append(value)	## <state>new_text = CLRJ | value = CLRJ</state>
        length = len(new_text)	## <state>length = CLRJ | new_text = CLRJ</state>
    except IndexError:
        length = 0
    return '[' + str(length) + ']'	## <state>length = CLRJ</state>
