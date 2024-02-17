def f(text, tabsize):
    return '\n'.join([
    	t.expandtabs(tabsize)
        for t in text.split('\n')
    ])