def len_log(list1):
    max=len(list1[0])
    for i in list1:
        if len(i)>max:
            max=len(i)
    return max