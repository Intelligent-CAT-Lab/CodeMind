def f(text, tab_size):
    res = ''	## res = []
    text = text.replace('\t', ' '*(tab_size-1))	## text = [] | tab_size = []
    for i in range(len(text)):	## i = [] | text = []
        if text[i] == ' ':	## text = [] | i = []
            res += '|'	## res = []
        else:
            res += text[i]	## res = [] | text = [] | i = []
    return res	## res = []
