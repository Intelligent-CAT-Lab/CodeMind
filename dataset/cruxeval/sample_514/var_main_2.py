def f(text):
    for item in text.split():	## item = [] | text = []
        text = text.replace('-{}'.format(item), ' ').replace('{}-'.format(item), ' ')	## text = [] | item = []
    return text.strip('-')	## text = []
