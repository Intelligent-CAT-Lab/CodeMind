def f(text, value):
    indexes = list()	## indexes = []
    for i in range(len(text)):	## i = [] | text = []
        if text[i] == value:	## text = [] | i = [] | value = []
            indexes.append(i)	## indexes = [] | i = []
    new_text = list(text)	## new_text = [] | text = []
    for i in indexes:	## i = [] | indexes = []
        new_text.remove(value)	## new_text = [] | value = []
    return ''.join(new_text)	## new_text = []
