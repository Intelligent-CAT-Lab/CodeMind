def f(name):
    new_name =''	## {"new_name" : ''}
    name = name[::-1]	## {"name" : ''}
    for i in range(len(name)):	## {"i" : '',"name" : ''}
        n = name[i]	## {"n" : '',"name" : '',"i" : ''}
        if n !='.' and  new_name.count('.')<2:	## {"n" : '',"new_name" : ''}
            new_name=n+new_name	## {"new_name" : '',"n" : ''}
        else:
            break
    return new_name	## {"new_name" : ''}
