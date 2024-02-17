multi_string = 'I am hungry! eat food.'
cond_string = map(str.isascii, multi_string.split())
if True in cond_string:
    print(', '.join(x for x in multi_string.split() if x.isascii()))
else:
    print('')