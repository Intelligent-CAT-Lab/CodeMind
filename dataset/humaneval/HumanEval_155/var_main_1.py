def even_odd_count(num):
    even_count = 0	## even_count = CLRJ
    odd_count = 0	## odd_count = CLRJ
    for i in str(abs(num)):	## i = CLRJ|num = CLRJ
        if int(i)%2==0:	## i = CLRJ
            even_count +=1
        else:
            odd_count +=1	## odd_count = CLRJ
    return (even_count, odd_count)	## even_count = CLRJ|odd_count = CLRJ
