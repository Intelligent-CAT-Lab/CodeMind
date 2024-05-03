def f(text):
    (k, l) = (0, len(text) - 1)	## <state>k = CLRJ | l = CLRJ | text = CLRJ</state>
    while not text[l].isalpha():	## <state>text = CLRJ | l = CLRJ</state>
        l -= 1
    while not text[k].isalpha():	## <state>text = CLRJ | k = CLRJ</state>
        k += 1
    if k != 0 or l != len(text) - 1:	## <state>k = CLRJ | l = CLRJ | text = CLRJ</state>
        return text[k: l+1]
    else:
        return text[0]	## <state>text = CLRJ</state>
