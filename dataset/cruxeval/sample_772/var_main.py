def f(phrase):
    result = ''	## {"result" : ''}
    for i in phrase:	## {"i" : '',"phrase" : ''}
        if not i.islower():	## {"i" : ''}
            result += i	## {"result" : '',"i" : ''}
    return result	## {"result" : ''}
