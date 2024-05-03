def f(text):
    count = text.count(text[0])	## count = [] | text = []
    ls = list(text)	## ls = [] | text = []
    for _ in range(count):	## _ = [] | count = []
        ls.remove(ls[0])	## ls = []
    return ''.join(ls)	## ls = []
