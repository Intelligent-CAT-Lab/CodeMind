students = ['r', '9']
seatlist = students
seatlist.reverse()
cnt = 0
for cnt in range(len(seatlist)):
    cnt += 2
    seatlist[cnt - 1:cnt] = ['+']
seatlist.append('+')
print(seatlist)