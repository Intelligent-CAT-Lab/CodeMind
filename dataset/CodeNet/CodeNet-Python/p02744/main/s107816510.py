n=int(eval(input()))
def f(s):
    m=ord(max(list(s))) - 97
    res = [s for _ in range(m+2)]
    for i in range(m+2):
        res[i] += chr(i+97)
    return res
def main(n):
    if n==1:
        return ["a"]
    else:
        ans = []
        for k in main(n-1):
            ans.extend(f(k))
        return ans

ans = main(n)
for i in ans:
    print(i)