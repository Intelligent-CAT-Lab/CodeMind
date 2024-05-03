def f(tuple_list, joint):
    string = ''	## {"string" : ''}
    for num in tuple_list:	## {"num" : '',"tuple_list" : ''}
        string += dict.fromkeys(str(num), joint * len(str(num))).popitem()[0] + joint	## {"string" : '',"num" : '',"joint" : ''}
    return string	## {"string" : ''}
