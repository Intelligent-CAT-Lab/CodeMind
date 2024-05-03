def f(text):
    odd = ''	## <state>odd = CLRJ</state>
    even = ''	## <state>even = CLRJ</state>
    for i, c in enumerate(text):	## <state>i = CLRJ | c = CLRJ | text = CLRJ</state>
        if i % 2 == 0:	## <state>i = CLRJ</state>
            even += c	## <state>even = CLRJ | c = CLRJ</state>
        else:
            odd += c	## <state>odd = CLRJ | c = CLRJ</state>
    return even + odd.lower()	## <state>even = CLRJ | odd = CLRJ</state>
