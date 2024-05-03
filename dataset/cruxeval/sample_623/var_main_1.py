def f(text, rules):
    for rule in rules:	## rule = CLRJ | rules = CLRJ
        if rule == '@':	## rule = CLRJ
            text = text[::-1]
        elif rule == '~':	## rule = CLRJ
            text = text.upper()	## text = CLRJ
        elif text and text[len(text)-1] == rule:	## text = CLRJ | rule = CLRJ
            text = text[0:len(text)-1]	## text = CLRJ
    return text	## text = CLRJ
