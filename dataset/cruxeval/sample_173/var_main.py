def f(list_x):
    item_count = len(list_x)	## {"item_count" : '',"list_x" : ''}
    new_list = []	## {"new_list" : ''}
    for i in range(item_count):	## {"i" : '',"item_count" : ''}
        new_list.append(list_x.pop())	## {"new_list" : '',"list_x" : ''}
    return new_list	## {"new_list" : ''}
