def f(s):
    count = {}	## {"count" : ''}
    for i in s:	## {"i" : '',"s" : ''}
        if i.islower():	## {"i" : ''}
            count[i.lower()] = s.count(i.lower()) + count.get(i.lower(), 0)
        else:
            count[i.lower()] = s.count(i.upper()) + count.get(i.lower(), 0)	## {"count" : '',"i" : '',"s" : ''}
    return count	## {"count" : ''}
