def f(text, letter):
    if letter in text:	## letter = [] | text = []
        start = text.index(letter)	## start = [] | text = [] | letter = []
        return text[start + 1:] + text[:start + 1]	## text = [] | start = []
    return text