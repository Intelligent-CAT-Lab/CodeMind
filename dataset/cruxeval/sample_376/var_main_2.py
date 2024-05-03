def f(text):
    for i in range(len(text)):	## i = [] | text = []
        if text[0:i].startswith("two"):	## text = [] | i = []
            return text[i:]
    return 'no'