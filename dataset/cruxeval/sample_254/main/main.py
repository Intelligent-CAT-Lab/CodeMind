def f(text, repl):
    trans = str.maketrans(text.lower(), repl.lower())
    return text.translate(trans)