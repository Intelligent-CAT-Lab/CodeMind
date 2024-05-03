def triples_sum_to_zero(l: list):
    for i in range(len(l)):	## i = CLRJ|l = CLRJ
        for j in range(i + 1, len(l)):	## j = CLRJ|i = CLRJ|l = CLRJ
            for k in range(j + 1, len(l)):	## k = CLRJ|j = CLRJ|l = CLRJ
                if l[i] + l[j] + l[k] == 0:	## l = CLRJ|i = CLRJ|j = CLRJ|k = CLRJ
                    return True
    return False
