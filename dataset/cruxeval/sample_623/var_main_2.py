def f(text, rules):
    for rule in rules:	## rule = [] | rules = []
        if rule == '@':	## rule = []
            text = text[::-1]
        elif rule == '~':	## rule = []
            text = text.upper()	## text = []
        elif text and text[len(text)-1] == rule:	## text = [] | rule = []
            text = text[0:len(text)-1]	## text = []
    return text	## text = []
