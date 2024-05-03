def f(text):
    s = text.lower()	## {"s" : '',"text" : ''}
    for i in range(len(s)):	## {"i" : '',"s" : ''}
        if s[i] == 'x':	## {"s" : '',"i" : ''}
            return 'no'
    return text.isupper()