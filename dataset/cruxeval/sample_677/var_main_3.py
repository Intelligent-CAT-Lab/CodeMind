def f(text, length):
    length = -length if length < 0 else length	## <state>length = CLRJ</state>
    output = ''	## <state>output = CLRJ</state>
    for idx in range(length):	## <state>idx = CLRJ | length = CLRJ</state>
        if text[idx % len(text)] != ' ':	## <state>text = CLRJ | idx = CLRJ</state>
            output += text[idx % len(text)]	## <state>output = CLRJ | text = CLRJ | idx = CLRJ</state>
        else:
            break
    return output	## <state>output = CLRJ</state>
