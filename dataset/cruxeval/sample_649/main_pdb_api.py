def f(text, tabsize):
    return '\n'.join([
    	t.expandtabs(tabsize)
        for t in text.split('\n')
    ])
f("\tf9\n\tldf9\n\tadf9!\n\tf9?", 1)