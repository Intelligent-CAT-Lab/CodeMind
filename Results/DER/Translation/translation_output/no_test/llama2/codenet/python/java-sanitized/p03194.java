> Translate the following python code to java and enclose your solution inside :

n, p = list(map(int, input().split()))

if n == 1 :
    print(p)
elif p == 1 :
    print(1)
elif n >= 40:
    print(1)
else:
    ans = 1
    count = 2
    tmp = count**n
    while (tmp) <= p:
        if(p % tmp == 0):
            ans *= count
            p = int(p/tmp)
            count -= 1
        count += 1
        tmp = count**n
    print(ans)