
S = input()
y = [0,0,0]
ans = -1e64

def calc(s):
    #print(s)
    A = []
    i = 0
    cntr = 0
    s2 = ""
    for j,c in enumerate(s):
        if cntr > 0:
            if c == ')':
                cntr -= 1
                if cntr == 0:
                    A.append(calc(s2))
                    continue
            if c == '(':
                cntr += 1
            s2 = s2 + c
        else:
            if c.isdigit():
                i *= 10
                i += int(c)
            else:
                if c == '(':
                    cntr += 1
                    if cntr == 1:
                        s2 = ""
                    continue
                if s[j - 1] != ')':
                    A.append(i)
                i = 0
                A.append(c)
    A.append(i)
    #print(A)
    for i in range(3):
        j = 0
        while j < len(A):
            a = A[j]
            if a == "+" and y[0] == i:
                A[j - 1] += A[j + 1]
                del A[j : j + 2]
            elif a == "-" and y[1] == i:
                A[j - 1] -= A[j + 1]
                del A[j : j + 2]
            elif a == "*" and y[2] == i:
                A[j - 1] *= A[j + 1]
                del A[j : j + 2]
            else:
                j += 1
    return A[0]


for i in range(27):
    y[0] = i // 9
    y[1] = (i % 9) // 3
    y[2] = i % 3
    ans = max(ans, calc(S))

print(ans)

