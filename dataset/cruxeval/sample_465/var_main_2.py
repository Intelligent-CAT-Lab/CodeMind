def f(seq, value):
    roles = dict.fromkeys(seq, 'north')	## roles = [] | seq = []
    if value:	## value = []
        roles.update(key.strip() for key in value.split(', '))
    return roles	## roles = []
