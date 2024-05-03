def f(text):
    x = 0	## {"x" : ''}
    if text.islower():	## {"text" : ''}
        for c in text:
            if int(c) in list(range(90)):
                x+=1
    return x	## {"x" : ''}
