def f(text):
    text = text.split(' ')	## text = []
    for t in text:	## t = [] | text = []
        if not t.isnumeric():	## t = []
            return 'no'
    return 'yes'