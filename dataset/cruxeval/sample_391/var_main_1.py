def f(students):
    seatlist = students	## seatlist = CLRJ | students = CLRJ
    seatlist.reverse()	## seatlist = CLRJ
    cnt = 0	## cnt = CLRJ
    for cnt in range(len(seatlist)):	## cnt = CLRJ | seatlist = CLRJ
        cnt += 2	## cnt = CLRJ
        seatlist[cnt - 1:cnt] = ['+']	## seatlist = CLRJ | cnt = CLRJ
    seatlist.append('+')	## seatlist = CLRJ
    return seatlist	## seatlist = CLRJ
