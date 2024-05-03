def f(s, from_c, to_c):
    table = s.maketrans(from_c, to_c)	## <state>table = CLRJ | s = CLRJ | from_c = CLRJ | to_c = CLRJ</state>
    return s.translate(table)	## <state>s = CLRJ | table = CLRJ</state>
