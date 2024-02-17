S = list(input())
N = len(S)
akiba = ['K','I','H','B','R']
flagA = True
i = 0
ia = 0
flag = True
while i < N:
    if i > 9:
        flag = False
        break
    if S[i] == 'A':
        if not(flagA) or (ia >= 1 and ia <= 2):
            flag = False
            break
        flagA = False
        i += 1
    else:
        flagA = True
        if ia > 4:
            flag = False
            break
        if S[i] == akiba[ia]:
            ia += 1
            i += 1
        else:
            flag = False
            break
if ia < 5:
    flag = False

if flag :
    print('YES')
else:
    print('NO')

    
    
#for i in range(2 ** 4):
    
    
    

 
    
    
