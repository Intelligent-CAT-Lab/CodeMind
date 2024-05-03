def total_match(lst1, lst2):
    l1 = 0	## l1 = CLRJ
    for st in lst1:	## st = CLRJ|lst1 = CLRJ
        l1 += len(st)	## l1 = CLRJ|st = CLRJ
    
    l2 = 0	## l2 = CLRJ
    for st in lst2:	## st = CLRJ|lst2 = CLRJ
        l2 += len(st)	## l2 = CLRJ|st = CLRJ
    
    if l1 <= l2:	## l1 = CLRJ|l2 = CLRJ
        return lst1
    else:
        return lst2	## lst2 = CLRJ
