s = "needed"
def solve(s):
    n = len(s)
    for i in range(1,n):
        if s[i-1] == s[i]:
            print(i,i+1)
            return
    for i in range(2,n):
        if s[i-2] == s[i]:
            print(i-1,i+1)
            return
    print(-1,-1)
    return
solve(s)