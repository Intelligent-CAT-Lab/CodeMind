def f(text):
    b = True	## b = []
    for x in text:	## x = [] | text = []
        if x.isdigit():	## x = []
            b = True
        else:
            b = False	## b = []
            break
    return b	## b = []
