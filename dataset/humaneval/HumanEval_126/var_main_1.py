def is_sorted(lst):
    count_digit = dict([(i, 0) for i in lst])	## count_digit = CLRJ|i = CLRJ|lst = CLRJ
    for i in lst:	## i = CLRJ|lst = CLRJ
        count_digit[i]+=1 	## count_digit = CLRJ|i = CLRJ
    if any(count_digit[i] > 2 for i in lst):	## count_digit = CLRJ|i = CLRJ|lst = CLRJ
        return False
    if all(lst[i-1] <= lst[i] for i in range(1, len(lst))):	## lst = CLRJ|i = CLRJ
        return True
    else:
        return False
    
    
