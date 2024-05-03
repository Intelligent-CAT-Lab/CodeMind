def f(list_x):
    item_count = len(list_x)	## <state>item_count = CLRJ | list_x = CLRJ</state>
    new_list = []	## <state>new_list = CLRJ</state>
    for i in range(item_count):	## <state>i = CLRJ | item_count = CLRJ</state>
        new_list.append(list_x.pop())	## <state>new_list = CLRJ | list_x = CLRJ</state>
    return new_list	## <state>new_list = CLRJ</state>
