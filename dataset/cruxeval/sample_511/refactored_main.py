fields = ('ct', 'c', 'ca')
update_dict = {'ca': 'cx'}
di = dict((x, '') for x in fields)
di.update(update_dict)
print(di)