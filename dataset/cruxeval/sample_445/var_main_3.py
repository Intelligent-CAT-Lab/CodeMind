def f(names):
    parts = names.split(',')	## <state>parts = CLRJ | names = CLRJ</state>
    for i, part in enumerate(parts):	## <state>i = CLRJ | part = CLRJ | parts = CLRJ</state>
        parts[i] = part.replace(' and', '+').title().replace('+', ' and')	## <state>parts = CLRJ | i = CLRJ | part = CLRJ</state>
    return ', '.join(parts)	## <state>parts = CLRJ</state>
