def gcd(x, y):
    return gcd(y, x%y) if y else x

def printV(x, y):
    g = gcd(x, y)
    print((str(x//g) + "/" +  str(y//g)))

S = eval(input())
all = ""
sub = ""
p = -1

for i in range(len(S)):
    if S[i] == '.':
        o = i
    elif S[i] == '(':
        p = i
        sub = all
    elif S[i] != ')':
        all += S[i]

d = len(S) - o - 1
l = p - o - 1
if p == -1:
    printV(int(all), 10**d)
else:
    d -= 2 # for ()
    printV(int(all) - int(sub), 10**d - 10**l)

