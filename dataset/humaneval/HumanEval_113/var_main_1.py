def odd_count(lst):
    res = []	## res = CLRJ
    for arr in lst:	## arr = CLRJ|lst = CLRJ
        n = sum(int(d)%2==1 for d in arr)	## n = CLRJ|d = CLRJ|arr = CLRJ
        res.append("the number of odd elements " + str(n) + "n the str"+ str(n) +"ng "+ str(n) +" of the "+ str(n) +"nput.")	## res = CLRJ|n = CLRJ
    return res	## res = CLRJ
