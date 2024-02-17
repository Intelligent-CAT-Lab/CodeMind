import sys
input = sys.stdin.readline
S = list("eel".rstrip())
L = len(S)
# binary indexed tree
bit = [0 for _ in range(L+1)]
# 0からiまでの区間和
# 立っているビットを下から処理
def query_sum(i):
    s = 0
    while i > 0:
        s += bit[i]
        i -= i & -i
    return s
# i番目の要素にxを足す
# 覆ってる区間すべてに足す
def add(i, x):
    while i <= L:
        bit[i] += x
        i += i & -i
def main():
    A = {}
    for i, s in enumerate(S):
        if not s in A.keys():
            A[s] = [i]
        else:
            A[s].append(i)
    odd = 0
    dic = {}
    for al, c in A.items():
        dic[al] = 0
        if len(c)%2 != 0:
            odd += 1
    if odd > 1:
        print(-1)
    else:
        make_ind = []
        for s, B in A.items():
            l = len(B)
            if l%2 == 1:
                mid = B[l//2]
            for j, b in enumerate(B):
                if j < l//2:
                    make_ind.append(b)
        make_ind.sort()
        IND = [None]*L
        for i, m in enumerate(make_ind):
            s = S[m]
            IND[m] = i+1
            inv = A[s][len(A[s])-1-dic[s]]
            IND[inv] = L-i
            dic[s] += 1
        if L%2 == 1:
            IND[mid] = L//2+1
        ans = 0
        for j, a in enumerate(IND):
            ans += j - query_sum(a)
            add(a, 1)
        print(ans)
if __name__ == "__main__":
    main()