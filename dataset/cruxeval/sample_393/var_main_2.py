def f(text):
    ls = text[::-1]	## ls = [] | text = []
    text2 = ''	## text2 = []
    for i in range(len(ls) - 3, 0, -3):	## i = [] | ls = []
        text2 += '---'.join(ls[i:i + 3]) + '---'	## text2 = [] | ls = [] | i = []
    return text2[:-3]	## text2 = []
