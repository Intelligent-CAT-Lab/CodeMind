def f(text):
    x = 0	## x = CLRJ
    if text.islower():	## text = CLRJ
        for c in text:
            if int(c) in list(range(90)):
                x+=1
    return x	## x = CLRJ
