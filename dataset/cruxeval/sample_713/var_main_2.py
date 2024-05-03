def f(text, char):
    if char in text:	## char = [] | text = []
        text = [t.strip() for t in text.split(char) if t]	## text = [] | t = [] | char = []
        if len(text) > 1:	## text = []
            return True
    return False