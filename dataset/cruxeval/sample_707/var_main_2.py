def f(text, position):
    length = len(text)	## length = [] | text = []
    index = position % (length + 1)	## index = [] | position = [] | length = []
    if position < 0 or index < 0:	## position = [] | index = []
        index = -1
    new_text = list(text)	## new_text = [] | text = []
    new_text.pop(index)	## new_text = [] | index = []
    return ''.join(new_text)	## new_text = []
