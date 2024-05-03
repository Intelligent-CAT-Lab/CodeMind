def f(tokens):
    tokens = tokens.split()	## tokens = CLRJ
    if len(tokens) == 2:	## tokens = CLRJ
        tokens = list(reversed(tokens))	## tokens = CLRJ
    result = ' '.join([tokens[0].ljust(5), tokens[1].ljust(5)])	## result = CLRJ | tokens = CLRJ
    return result	## result = CLRJ
