def f(text):
    new_text = text	## new_text = [] | text = []
    while len(text) > 1 and text[0] == text[-1]:	## text = []
        new_text = text = text[1:-1]
    return new_text	## new_text = []
