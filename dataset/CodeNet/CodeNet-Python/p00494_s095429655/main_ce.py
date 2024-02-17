S="OJJOOIIOJOI"
N=len(S)
k=0
i=0
while i<N:
    cntj,cnto,cnti=0,0,0
    while i<N and S[i]=="J":
        cntj+=1
        i+=1
    while i<N and S[i]=="O":
        cnto+=1
        i+=1
    while i<N and S[i]=="I":
        cnti+=1
        i+=1
    if cntj>=cnto and cnti>=cnto:
        k=max(cnto,k)
print k