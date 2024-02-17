text = "\tf9\n\tldf9\n\tadf9!\n\tf9?"
tabsize = 1
print('\n'.join([t.expandtabs(tabsize) for t in text.split('\n')]))