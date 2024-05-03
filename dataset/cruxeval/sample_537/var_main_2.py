def f(text, value):
    new_text = list(text)	## new_text = [] | text = []
    try:
        new_text.append(value)	## new_text = [] | value = []
        length = len(new_text)	## length = [] | new_text = []
    except IndexError:
        length = 0
    return '[' + str(length) + ']'	## length = []
