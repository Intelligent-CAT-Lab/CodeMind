def file_name_check(file_name):
    suf = ['txt', 'exe', 'dll']	## suf = CLRJ
    lst = file_name.split(sep='.')	## lst = CLRJ|file_name = CLRJ
    if len(lst) != 2:	## lst = CLRJ
        return 'No'
    if not lst[1] in suf:	## lst = CLRJ|suf = CLRJ
        return 'No'
    if len(lst[0]) == 0:	## lst = CLRJ
        return 'No'
    if not lst[0][0].isalpha():	## lst = CLRJ
        return 'No'
    t = len([x for x in lst[0] if x.isdigit()])	## t = CLRJ|x = CLRJ|lst = CLRJ
    if t > 3:	## t = CLRJ
        return 'No'
    return 'Yes'
