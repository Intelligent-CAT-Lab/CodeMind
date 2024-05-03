def f(text, characters):
    for i in range(len(characters)):	## i = [] | characters = []
        text = text.rstrip(characters[i::len(characters)])	## text = [] | characters = [] | i = []
    return text	## text = []
