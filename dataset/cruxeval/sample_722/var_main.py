def f(text):
    out = ""	## {"out" : ''}
    for i in range(len(text)):	## {"i" : '',"text" : ''}
        if text[i].isupper():	## {"text" : '',"i" : ''}
            out += text[i].lower()	## {"out" : '',"text" : '',"i" : ''}
        else:
            out += text[i].upper()	## {"out" : '',"text" : '',"i" : ''}
    return out	## {"out" : ''}
