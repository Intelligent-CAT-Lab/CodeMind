def f(text, symbols):
    count = 0	## {"count" : ''}
    if symbols:	## {"symbols" : ''}
        for i in symbols:	## {"i" : '',"symbols" : ''}
            count += 1	## {"count" : ''}
        text = text * count	## {"text" : '',"count" : ''}
    return text.rjust(len(text) + count*2)[:-2]	## {"text" : '',"count" : ''}
