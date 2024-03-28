class main:
    str = input()
    ch = []
    for i in range(4):
        ch.append(str[i])
    
    a = int(ch[0])
    b = int(ch[1])
    c = int(ch[2])
    d = int(ch[3])
    
    ans = []
    
    if a + b + c + d == 7:
        ans.append("+")
        ans.append("+")
        ans.append("+")
    elif a + b + c - d == 7:
        ans.append("+")
        ans.append("+")
        ans.append("-")
    elif a + b - c + d == 7:
        ans.append("+")
        ans.append("-")
        ans.append("+")
    elif a - b + c + d == 7:
        ans.append("-")
        ans.append("+")
        ans.append("+")
    elif a + b - c - d == 7:
        ans.append("+")
        ans.append("-")
        ans.append("-")
    elif a - b + c - d == 7:
        ans.append("-")
        ans.append("+")
        ans.append("-")
    elif a - b - c + d == 7:
        ans.append("-")
        ans.append("-")
        ans.append("+")
    elif a - b - c - d == 7:
        ans.append("-")
        ans.append("-")
        ans.append("-")
    
    print(a, ans[0], b, ans[1], c, ans[2], d, "=7", sep="")