def f(text):
    for punct in '!.?,:;':	## punct = CLRJ
        if text.count(punct) > 1:	## text = CLRJ | punct = CLRJ
            return 'no'
        if text.endswith(punct):	## text = CLRJ | punct = CLRJ
            return 'no'
    return text.title()	## text = CLRJ
