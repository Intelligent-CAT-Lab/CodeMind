g = [None]*50
h = [None]*50
h[1] = 3
g[1] = 6
X= int(input())
for i in range(2, X+1):
    h[i] = g[i-1] + 1
    g[i] = 2*h[i]
print(g[X])
