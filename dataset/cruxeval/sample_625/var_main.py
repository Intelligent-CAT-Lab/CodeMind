def f(text):
    count = 0	## {"count" : ''}
    for i in text:	## {"i" : '',"text" : ''}
        if i in '.?!.,':	## {"i" : ''}
            count += 1	## {"count" : ''}
    return count	## {"count" : ''}
