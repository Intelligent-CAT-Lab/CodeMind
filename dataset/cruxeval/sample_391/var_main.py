def f(students):
    seatlist = students	## {"seatlist" : '',"students" : ''}
    seatlist.reverse()	## {"seatlist" : ''}
    cnt = 0	## {"cnt" : ''}
    for cnt in range(len(seatlist)):	## {"cnt" : '',"seatlist" : ''}
        cnt += 2	## {"cnt" : ''}
        seatlist[cnt - 1:cnt] = ['+']	## {"seatlist" : '',"cnt" : ''}
    seatlist.append('+')	## {"seatlist" : ''}
    return seatlist	## {"seatlist" : ''}
