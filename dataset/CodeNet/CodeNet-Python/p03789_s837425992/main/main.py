import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

"""
・1,11,111,...に分解して9個ずつまとめる
・9倍して考える。9N+x の digit sum <= x となる最小のxが知りたい
・xが満たせばx+1も満たすので、二分探索できる
"""

N = [x - ord('0') for x in map(int,read().rstrip())][::-1]

# とりあえず 9 倍
N = [9 * x for x in N] + [0] * 10
L = len(N)

for i in range(L-1):
    q,r = divmod(N[i],10)
    N[i] = r
    N[i+1] += q

high1 = sum(N[10:])
N[10] += 1
for i in range(10,L-1):
    if N[i] == 10:
        N[i] = 0
        N[i+1] += 1
high2 = sum(N[10:])
low = N[:10]

low = sum(x * 10 ** i for i,x in enumerate(N[:10]))

A = 10 ** 10

def digit_sum(N):
    return sum(map(int,str(N)))

def test(x):
    if low + x >= A:
        return digit_sum(low + x) - 1 + high2 <= x
    return digit_sum(low + x) + high1 <= x

left = 0
right = 10 ** 10
while left + 1 < right:
    x = (left + right) // 2
    if test(x):
        right = x
    else:
        left = x

answer = (right + 8) // 9
print(answer)