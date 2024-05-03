def f(text, symbols):
    count = 0	## count = CLRJ
    if symbols:	## symbols = CLRJ
        for i in symbols:	## i = CLRJ | symbols = CLRJ
            count += 1	## count = CLRJ
        text = text * count	## text = CLRJ | count = CLRJ
    return text.rjust(len(text) + count*2)[:-2]	## text = CLRJ | count = CLRJ
