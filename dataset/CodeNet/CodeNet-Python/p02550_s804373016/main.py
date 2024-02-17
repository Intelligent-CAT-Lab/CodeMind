N,X,M = map(int,input().split())

List = [X]

for i in range(N-1):
    X = X**2 % M
    if X in List:
        #配列の何番目か
        num = i + 1
        #同じ数字
        key = List.index(X)
        break
    List.append(X)

ans = sum(List)
if len(List) == N:
    print(ans)

else:
    loop = (N - len(List)) // (num - key)
    add = (N - len(List)) % (num - key)

    ans += (N - len(List)) // (num - key) * sum(List[key:num])
    ans += sum(List[key:key+((N - len(List)) % (num - key))])

    print(ans)
