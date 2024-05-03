def f(students):
    seatlist = students	## <state>seatlist = CLRJ | students = CLRJ</state>
    seatlist.reverse()	## <state>seatlist = CLRJ</state>
    cnt = 0	## <state>cnt = CLRJ</state>
    for cnt in range(len(seatlist)):	## <state>cnt = CLRJ | seatlist = CLRJ</state>
        cnt += 2	## <state>cnt = CLRJ</state>
        seatlist[cnt - 1:cnt] = ['+']	## <state>seatlist = CLRJ | cnt = CLRJ</state>
    seatlist.append('+')	## <state>seatlist = CLRJ</state>
    return seatlist	## <state>seatlist = CLRJ</state>
