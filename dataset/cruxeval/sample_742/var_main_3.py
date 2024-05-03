def f(text):
    b = True	## <state>b = CLRJ</state>
    for x in text:	## <state>x = CLRJ | text = CLRJ</state>
        if x.isdigit():	## <state>x = CLRJ</state>
            b = True
        else:
            b = False	## <state>b = CLRJ</state>
            break
    return b	## <state>b = CLRJ</state>
