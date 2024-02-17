# coding: utf-8
# Your code here!
 
S=list(eval(input()))
 
 
S=list([ord(x)-97 for x in S])
 
alpha=[0]*26
for s in S:
    alpha[s]=1
 
if len(S)!=26:
    for i in range(26):
        if alpha[i] == 0:
            S.append(i)
            ans=S[:]
            ans=list([chr(x+97) for x in ans])
            print(("".join(ans)))
            exit()
else:
    for i in range(26)[::-1]:
        if alpha[S[i]:].count(0)>0:
            for j in range(S[i],26):
                if alpha[j]==0:
                    ans=S[:i]+[j]
                    ans=list([chr(x+97) for x in ans])
                    print(("".join(ans)))
                    exit()
        else:
            alpha[S[i]]=0
 
print((-1))