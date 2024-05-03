def f(text):
    result = ""	## result = []
    for i in range(len(text)):	## i = [] | text = []
        if i % 2 == 0:	## i = []
            result += text[i].swapcase()	## result = [] | text = [] | i = []
        else:
            result += text[i]	## result = [] | text = [] | i = []
    return result	## result = []
