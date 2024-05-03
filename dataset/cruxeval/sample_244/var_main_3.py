def f(text, symbols):
    count = 0	## <state>count = CLRJ</state>
    if symbols:	## <state>symbols = CLRJ</state>
        for i in symbols:	## <state>i = CLRJ | symbols = CLRJ</state>
            count += 1	## <state>count = CLRJ</state>
        text = text * count	## <state>text = CLRJ | count = CLRJ</state>
    return text.rjust(len(text) + count*2)[:-2]	## <state>text = CLRJ | count = CLRJ</state>
