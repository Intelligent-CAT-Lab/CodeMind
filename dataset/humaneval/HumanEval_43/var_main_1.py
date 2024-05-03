def pairs_sum_to_zero(l):
    for i, l1 in enumerate(l):	## i = CLRJ|l1 = CLRJ|l = CLRJ
        for j in range(i + 1, len(l)):	## j = CLRJ|i = CLRJ|l = CLRJ
            if l1 + l[j] == 0:	## l1 = CLRJ|l = CLRJ|j = CLRJ
                return True
    return False
