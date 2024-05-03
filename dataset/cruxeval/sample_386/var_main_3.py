def f(concat, di):
    count = len(di)	## <state>count = CLRJ | di = CLRJ</state>
    for i in range(count):	## <state>i = CLRJ | count = CLRJ</state>
        if di[str(i)] in concat:	## <state>di = CLRJ | i = CLRJ | concat = CLRJ</state>
            di.pop(str(i))	## <state>di = CLRJ | i = CLRJ</state>
    return "Done!"