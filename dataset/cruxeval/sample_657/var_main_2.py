def f(text):
    for punct in '!.?,:;':	## punct = []
        if text.count(punct) > 1:	## text = [] | punct = []
            return 'no'
        if text.endswith(punct):	## text = [] | punct = []
            return 'no'
    return text.title()	## text = []
