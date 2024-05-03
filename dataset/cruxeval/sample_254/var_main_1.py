def f(text, repl):
    trans = str.maketrans(text.lower(), repl.lower())	## trans = CLRJ | text = CLRJ | repl = CLRJ
    return text.translate(trans)	## text = CLRJ | trans = CLRJ
