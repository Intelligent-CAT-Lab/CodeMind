def f(str, char):
    base = char * (str.count(char) + 1)	## <state>base = CLRJ | char = CLRJ | str = CLRJ</state>
    return str.removesuffix(base)	## <state>str = CLRJ | base = CLRJ</state>
