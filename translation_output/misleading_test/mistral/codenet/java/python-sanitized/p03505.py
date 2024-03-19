K = int(input())
A = int(input())
B = int(input())

ans = help(K,A,B)
print(ans)

def help(K,A,B):
    if A <= B:
        return A >= K ? 1 : -1
    if A >= K:
        return 1
    dif = A - B
    t = (K - A) // dif + ((K - A) % dif == 0 ? 0 : 1)
    return 2 * t + 1