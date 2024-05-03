def f(text, function):
    cites = [len(text[text.index(function) + len(function):])]	## cites = CLRJ | text = CLRJ | function = CLRJ
    for char in text:	## char = CLRJ | text = CLRJ
        if char == function:	## char = CLRJ | function = CLRJ
            cites.append(len(text[text.index(function) + len(function):]))
    return cites	## cites = CLRJ
