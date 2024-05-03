def f(values, item1, item2):
    if values[-1] == item2:	## <state>values = CLRJ | item2 = CLRJ</state>
        if values[0] not in values[1:]:
            values.append(values[0])
    elif values[-1] == item1:	## <state>values = CLRJ | item1 = CLRJ</state>
        if values[0] == item2:
            values.append(values[0])
    return values	## <state>values = CLRJ</state>
