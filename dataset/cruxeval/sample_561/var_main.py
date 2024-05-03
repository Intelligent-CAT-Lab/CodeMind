def f(text, digit):
    #different than previous? Just count instances digit
    count = text.count(digit)	## {"count" : '',"text" : '',"digit" : ''}
    return int(digit) * count	## {"digit" : '',"count" : ''}
