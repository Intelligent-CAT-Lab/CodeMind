def f(text):
    if text == '42.42':	## text = []
        return True
    for i in range(3, len(text) - 3):	## i = [] | text = []
        if text[i] == '.' and text[i - 3:].isdigit() and text[:i].isdigit():	## text = [] | i = []
            return True
    return False