def f(tokens):
    tokens = tokens.split()	## <state>tokens = CLRJ</state>
    if len(tokens) == 2:	## <state>tokens = CLRJ</state>
        tokens = list(reversed(tokens))	## <state>tokens = CLRJ</state>
    result = ' '.join([tokens[0].ljust(5), tokens[1].ljust(5)])	## <state>result = CLRJ | tokens = CLRJ</state>
    return result	## <state>result = CLRJ</state>
