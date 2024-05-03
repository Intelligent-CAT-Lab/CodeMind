def f(text):
    s = 0	## {"s" : ''}
    for i in range(1, len(text)):	## {"i" : '',"text" : ''}
        s += len(text.rpartition(text[i])[0])	## {"s" : '',"text" : '',"i" : ''}
    return s	## {"s" : ''}
