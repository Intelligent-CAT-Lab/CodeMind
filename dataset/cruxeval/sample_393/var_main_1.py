def f(text):
    ls = text[::-1]	## ls = CLRJ | text = CLRJ
    text2 = ''	## text2 = CLRJ
    for i in range(len(ls) - 3, 0, -3):	## i = CLRJ | ls = CLRJ
        text2 += '---'.join(ls[i:i + 3]) + '---'	## text2 = CLRJ | ls = CLRJ | i = CLRJ
    return text2[:-3]	## text2 = CLRJ
