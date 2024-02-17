S = eval(input())
ls = list(S)
ans = 0
for i in range(len(ls)):
    cnt = 0
    for j in range(i,len(ls)):
        if S[j] in ['A','T','C','G']:
            cnt += 1
            if j == len(ls) - 1:
                ans = max(ans,cnt)
        else:
            ans = max(ans,cnt)
            break
print(ans)