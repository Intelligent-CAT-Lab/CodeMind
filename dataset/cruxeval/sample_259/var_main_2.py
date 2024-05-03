def f(text):
    new_text = []	## new_text = []
    for character in text:	## character = [] | text = []
        if character.isupper():	## character = []
            new_text.insert(len(new_text) // 2, character)	## new_text = [] | character = []
    if len(new_text) == 0:	## new_text = []
        new_text = ['-']
    return ''.join(new_text)	## new_text = []
