def f(concat, di):
    count = len(di)	## count = CLRJ | di = CLRJ
    for i in range(count):	## i = CLRJ | count = CLRJ
        if di[str(i)] in concat:	## di = CLRJ | i = CLRJ | concat = CLRJ
            di.pop(str(i))	## di = CLRJ | i = CLRJ
    return "Done!"