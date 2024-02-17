S = input()

def AtoZ(s):
    for front in range(0,len(s)):
        if s[front] == "A":
            break
    for back in range(0,len(s))[::-1]:
        if s[back] == "Z":
            break
    ans = back - front + 1
    return ans

ans = AtoZ(S)
print(ans)
