def f(text, delim):
    first, second = text.split(delim)	## <state>first = CLRJ | second = CLRJ | text = CLRJ | delim = CLRJ</state>
    return second + delim + first	## <state>second = CLRJ | delim = CLRJ | first = CLRJ</state>
