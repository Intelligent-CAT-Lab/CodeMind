def f(tags):
    resp = ""	## {"resp" : ''}
    for key in tags:	## {"key" : '',"tags" : ''}
        resp += key + " "	## {"resp" : '',"key" : ''}
    return resp	## {"resp" : ''}
