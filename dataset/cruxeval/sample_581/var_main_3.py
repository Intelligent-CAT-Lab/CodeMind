def f(text, sign):
    length = len(text)	## <state>length = CLRJ | text = CLRJ</state>
    new_text = list(text)	## <state>new_text = CLRJ | text = CLRJ</state>
    sign = list(sign)	## <state>sign = CLRJ</state>
    for i in range(len(sign)):	## <state>i = CLRJ | sign = CLRJ</state>
        new_text.insert((i * length - 1) // 2 + (i + 1) // 2, sign[i])	## <state>new_text = CLRJ | i = CLRJ | length = CLRJ | sign = CLRJ</state>
    return ''.join(new_text)	## <state>new_text = CLRJ</state>
