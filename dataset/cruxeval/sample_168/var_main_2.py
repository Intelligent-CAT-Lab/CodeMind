def f(text, new_value, index):
    key = text.maketrans(text[index], new_value)	## key = [] | text = [] | index = [] | new_value = []
    return text.translate(key)	## text = [] | key = []
