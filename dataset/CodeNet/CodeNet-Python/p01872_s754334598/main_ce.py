P = list("?12345678901")
xi = P.index('?')
Q =[6, 5, 4, 3, 2, 7, 6, 5, 4, 3, 2]
pqsum = 0
for i in range(11):
    if P[i]=='?':
        pass
    else:
        pqsum += int(P[i])*Q[i]
if xi<11:
    Pxi = []
    for i in range(10):
        PQS = pqsum + i*Q[xi]
        if PQS%11<=1:
            P0 = 0
        if 1<PQS%11:
            P0 = 11-(PQS%11)
        if P0==int(P[11]):
            Pxi.append(i)
    if len(Pxi)==1:
        print(Pxi[0])
    else:
        print('MULTIPLE')
if xi==11:
    if pqsum%11<=1:
        P0 = 0
    if 1<pqsum%11:
        P0 = 11-(pqsum%11)
    print(P0)
