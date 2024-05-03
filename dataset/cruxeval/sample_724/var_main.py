def f(text, function):
    cites = [len(text[text.index(function) + len(function):])]	## {"cites" : '',"text" : '',"function" : ''}
    for char in text:	## {"char" : '',"text" : ''}
        if char == function:	## {"char" : '',"function" : ''}
            cites.append(len(text[text.index(function) + len(function):]))
    return cites	## {"cites" : ''}
