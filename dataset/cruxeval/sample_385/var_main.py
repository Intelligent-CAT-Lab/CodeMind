def f(lst):
    i = 0	## {"i" : ''}
    new_list = []	## {"new_list" : ''}
    while i < len(lst):	## {"i" : '',"lst" : ''}
        if lst[i] in lst[i+1:]:	## {"lst" : '',"i" : ''}
            new_list.append(lst[i])	## {"new_list" : '',"lst" : '',"i" : ''}
            if len(new_list) == 3:	## {"new_list" : ''}
                return new_list	## {"new_list" : ''}
        i += 1	## {"i" : ''}
    return new_list