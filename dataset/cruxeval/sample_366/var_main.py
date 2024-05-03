def f(string):
    tmp = string.lower()	## {"tmp" : '',"string" : ''}
    for char in string.lower():	## {"char" : '',"string" : ''}
        if char in tmp:	## {"char" : '',"tmp" : ''}
            tmp = tmp.replace(char, '', 1)	## {"tmp" : '',"char" : ''}
    return tmp	## {"tmp" : ''}
