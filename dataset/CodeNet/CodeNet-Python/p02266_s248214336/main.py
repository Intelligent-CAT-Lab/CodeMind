A = 0
left = []
Lake = []
s = input()
for i in range(len(s)):
    if s[i] == "\\":
        left.append(i)
    elif s[i] == "/":
        if len(left) > 0:
            w = left.pop()
            goukei = i - w
            A += goukei
            for i in range(len(Lake)-1,-1,-1):
                if Lake[i][0] > w:
                    x = Lake.pop()
                    goukei += x[1]
            Lake.append([w, goukei])
print(A)
if len(Lake) == 0:
    print(0)
else:
    print(len(Lake),end=" ")
for i in range(len(Lake)):
    if i == len(Lake) - 1:
        print(Lake[i][1])
    else:
        print(Lake[i][1],end=" ")