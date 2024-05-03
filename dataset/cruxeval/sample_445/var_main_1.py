def f(names):
    parts = names.split(',')	## parts = CLRJ | names = CLRJ
    for i, part in enumerate(parts):	## i = CLRJ | part = CLRJ | parts = CLRJ
        parts[i] = part.replace(' and', '+').title().replace('+', ' and')	## parts = CLRJ | i = CLRJ | part = CLRJ
    return ', '.join(parts)	## parts = CLRJ
