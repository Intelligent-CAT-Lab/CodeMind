def f(text):
    counter = 0	## {"counter" : ''}
    for char in text:	## {"char" : '',"text" : ''}
        if char.isalpha():	## {"char" : ''}
            counter += 1	## {"counter" : ''}
    return counter	## {"counter" : ''}
