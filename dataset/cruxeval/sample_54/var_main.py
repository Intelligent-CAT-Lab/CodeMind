def f(text, s, e):
    sublist = text[s:e]	## {"sublist" : '',"text" : '',"s" : '',"e" : ''}
    if not sublist:	## {"sublist" : ''}
        return -1
    return sublist.index(min(sublist))	## {"sublist" : ''}
