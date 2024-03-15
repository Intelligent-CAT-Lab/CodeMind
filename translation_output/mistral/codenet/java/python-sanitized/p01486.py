import sys

def saiki(S):
    if S == "":
        return True
    if S[0] != 'm':
        return False
    en = 1
    i = 1
    while i < len(S) and en != 0:
        if S[i] == 'm':
            en += 1
        elif S[i] == 'e':
            en -= 1
        i += 1
    if i == len(S):
        return False
    eindex = i
    mn = 1
    i += 1
    while i < len(S) and mn != 0:
        if S[i] == 'e':
            mn += 1
        elif S[i] == 'w':
            mn -= 1
        i += 1
    if i != len(S):
        return False
    return saiki(S[:eindex-1]) and saiki(S[eindex:])

S = input()
if saiki(S):
    print("Cat")
else:
    print("Rabbit")