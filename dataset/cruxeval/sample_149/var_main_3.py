def f(tuple_list, joint):
    string = ''	## <state>string = CLRJ</state>
    for num in tuple_list:	## <state>num = CLRJ | tuple_list = CLRJ</state>
        string += dict.fromkeys(str(num), joint * len(str(num))).popitem()[0] + joint	## <state>string = CLRJ | num = CLRJ | joint = CLRJ</state>
    return string	## <state>string = CLRJ</state>
