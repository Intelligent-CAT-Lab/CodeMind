def f(var):
    if var.isdigit():	## <state>var = CLRJ</state>
        return "int"
    elif var.replace('.', '', 1).isdigit():	## <state>var = CLRJ</state>
        return "float"
    elif var.count(' ') == len(var) - 1:	## <state>var = CLRJ</state>
        return "str"
    elif len(var) == 1:	## <state>var = CLRJ</state>
        return "char"
    else:
        return "tuple"