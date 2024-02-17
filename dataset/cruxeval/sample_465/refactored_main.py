seq = ['wise king', 'young king']
value = ''
roles = dict.fromkeys(seq, 'north')
if value:
    roles.update(key.strip() for key in value.split(', '))
print(roles)