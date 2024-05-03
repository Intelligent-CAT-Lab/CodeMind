def exchange(lst1, lst2):
    odd = 0	## odd = CLRJ
    even = 0	## even = CLRJ
    for i in lst1:	## i = CLRJ|lst1 = CLRJ
        if i%2 == 1:	## i = CLRJ
            odd += 1	## odd = CLRJ
    for i in lst2:	## i = CLRJ|lst2 = CLRJ
        if i%2 == 0:	## i = CLRJ
            even += 1	## even = CLRJ
    if even >= odd:	## even = CLRJ|odd = CLRJ
        return "YES"
    return "NO"
            
