def f(text, repl):
    trans = str.maketrans(text.lower(), repl.lower())	## trans = [] | text = [] | repl = []
    return text.translate(trans)	## text = [] | trans = []
