def f(text):
    new_text = list(text)	## new_text = [] | text = []
    for i in '+':	## i = []
        if i in new_text:	## i = [] | new_text = []
            new_text.remove(i)
    return ''.join(new_text)	## new_text = []
