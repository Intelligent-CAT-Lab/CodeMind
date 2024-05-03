def f(text):
    for item in text.split():	## item = CLRJ | text = CLRJ
        text = text.replace('-{}'.format(item), ' ').replace('{}-'.format(item), ' ')	## text = CLRJ | item = CLRJ
    return text.strip('-')	## text = CLRJ
