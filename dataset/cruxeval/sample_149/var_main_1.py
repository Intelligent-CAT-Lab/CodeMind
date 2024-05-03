def f(tuple_list, joint):
    string = ''	## string = CLRJ
    for num in tuple_list:	## num = CLRJ | tuple_list = CLRJ
        string += dict.fromkeys(str(num), joint * len(str(num))).popitem()[0] + joint	## string = CLRJ | num = CLRJ | joint = CLRJ
    return string	## string = CLRJ
