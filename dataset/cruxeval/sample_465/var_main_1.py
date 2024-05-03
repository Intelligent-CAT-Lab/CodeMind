def f(seq, value):
    roles = dict.fromkeys(seq, 'north')	## roles = CLRJ | seq = CLRJ
    if value:	## value = CLRJ
        roles.update(key.strip() for key in value.split(', '))
    return roles	## roles = CLRJ
