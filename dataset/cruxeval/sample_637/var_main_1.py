def f(text):
    text = text.split(' ')	## text = CLRJ
    for t in text:	## t = CLRJ | text = CLRJ
        if not t.isnumeric():	## t = CLRJ
            return 'no'
    return 'yes'