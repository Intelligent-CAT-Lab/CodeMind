def f(tokens):
    tokens = tokens.split()	## tokens = []
    if len(tokens) == 2:	## tokens = []
        tokens = list(reversed(tokens))	## tokens = []
    result = ' '.join([tokens[0].ljust(5), tokens[1].ljust(5)])	## result = [] | tokens = []
    return result	## result = []
