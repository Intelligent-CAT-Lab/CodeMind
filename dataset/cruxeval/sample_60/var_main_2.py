def f(doc):
    for x in doc:	## x = [] | doc = []
        if x.isalpha():	## x = []
            return x.capitalize()	## x = []
    return '-'