def f(text, function):
    cites = [len(text[text.index(function) + len(function):])]	## <state>cites = CLRJ | text = CLRJ | function = CLRJ</state>
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        if char == function:	## <state>char = CLRJ | function = CLRJ</state>
            cites.append(len(text[text.index(function) + len(function):]))
    return cites	## <state>cites = CLRJ</state>
