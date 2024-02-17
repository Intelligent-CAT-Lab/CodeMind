def CheckDisit(a) :
    tmp = 0
    for i in range(11) :
        if i <= 4 :
            tmp += int(a[i]) * (6-i)
        else :
            tmp += int(a[i]) * (12-i)
    tmp = tmp % 11
    if tmp <= 1 :
        return 0
    else :
        return (11 - tmp)
        
        
m = list(input())
if m[11] == '?' :
    print(CheckDisit(m))
else :
    ans = []
    x = m.index('?')
    for i in range(10) :
        m[x] = str(i)
        if int(m[11]) == CheckDisit(m) :
            ans.append(i)
    if len(ans) == 1 :
        print(ans[0])
    else :
        print("MULTIPLE")
        

