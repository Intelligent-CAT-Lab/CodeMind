S = list("((*)())")
S_l = len(S)
n=0
l = []
r = []
f_l, f_r = 0,0
for n in range(S.index('*')):
    if S[n]== '(':
        f_l += 1
    elif S[n]== ')':
        f_l -= 1
for n in range(S_l - S.index('*')):
    if S[S_l-n-1] == ')':
        f_r += 1
    elif S[S_l-n-1]== '(':
        f_r -= 1
print(min(f_r, f_l))
