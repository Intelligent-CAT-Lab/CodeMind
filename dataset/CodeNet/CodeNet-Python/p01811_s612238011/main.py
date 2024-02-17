import sys
sys.setrecursionlimit(5010)

def solve(s): 
    if len(s) ==3:
        if s[0]=='A' and s[1]=='B' and s[2]=='C':
            return True
        else:
            return False
    i=0
    a = 0
    b = 0
    c = 0
    lis =[]
    while i < len(s):
        if i+2<len(s) and s[i] =='A' and s[i+1] == 'B' and s[i+2] == 'C':
            lis.append('X')
            i += 3
        else:
            lis.append(s[i])
            if s[i] == 'A':
                a = 1
            if s[i] == 'B':
                b = 1
            if s[i] == 'C':
                c = 1
            i += 1

    if not(a+b+c == 2):
        return False
    if a==0:
        for i in range(len(lis)):
            if lis[i] == 'X':
                lis[i]='A'
    if b==0:
        for i in range(len(lis)):
            if lis[i] == 'X':
                lis[i]='B'
    if c==0:
        for i in range(len(lis)):
            if lis[i] == 'X':
                lis[i]='C'
    if len(s) == len(lis):
        return False

    return solve(lis)


if solve(input()):
    print("Yes")
else:
    print("No")

