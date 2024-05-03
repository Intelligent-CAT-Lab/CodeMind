def f(text, repl):
    trans = str.maketrans(text.lower(), repl.lower())	## <state>trans = CLRJ | text = CLRJ | repl = CLRJ</state>
    return text.translate(trans)	## <state>text = CLRJ | trans = CLRJ</state>
