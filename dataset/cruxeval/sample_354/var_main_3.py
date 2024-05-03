def f(description, values):
    if values[1] is None:	## <state>values = CLRJ</state>
        values = values[0:1]	## <state>values = CLRJ</state>
    else:
        values = values[1:]
    return description.format(*values)	## <state>description = CLRJ | values = CLRJ</state>
