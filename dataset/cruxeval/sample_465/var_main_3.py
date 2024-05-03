def f(seq, value):
    roles = dict.fromkeys(seq, 'north')	## <state>roles = CLRJ | seq = CLRJ</state>
    if value:	## <state>value = CLRJ</state>
        roles.update(key.strip() for key in value.split(', '))
    return roles	## <state>roles = CLRJ</state>
