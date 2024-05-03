def f(text):
    count = 0	## <state>count = CLRJ</state>
    for i in text:	## <state>i = CLRJ | text = CLRJ</state>
        if i in '.?!.,':	## <state>i = CLRJ</state>
            count += 1	## <state>count = CLRJ</state>
    return count	## <state>count = CLRJ</state>
