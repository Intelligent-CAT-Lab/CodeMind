from collections import deque


A = eval(input())
N = len(A)
a = ord('a')

edge = [[N + 1] * 26 for _ in range(N + 1)]
for i in range(N - 1, -1, -1):
    for j in range(26):
        edge[i][j] = edge[i + 1][j]
    c = ord(A[i]) - a
    edge[i][c] = i + 1  # 文字cの直後の頂点


recon = [None] * (N + 2)  # DP復元用。(直前の頂点, 文字)を格納する。
q = deque()
q.append(0)  # 頂点
while q:
    i = q.popleft()
    if i == N + 1:  # 頂点N+1に到達したら処理終了
        break
    for j in range(26):
        ni = edge[i][j]
        if recon[ni] is None:  # その頂点に最短で到達した場合のみ次の処理を継続
            recon[ni] = (i, chr(a + j))
            q.append(ni)

i = N + 1
ans = []
while i > 0:
    pi, c = recon[i]
    ans.append(c)
    i = pi

print((''.join(reversed(ans))))
