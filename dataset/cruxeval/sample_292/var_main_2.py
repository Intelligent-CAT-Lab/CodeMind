def f(text):
    new_text = [c if c.isdigit() else '*' for c in text]	## new_text = [] | c = [] | text = []
    return ''.join(new_text)	## new_text = []
