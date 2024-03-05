import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

import numpy as np

# (始点、三角形)の組に対して、3K番目を求めればよい

N,K = map(int,read().split())

import numpy as np

theta = np.pi/N

def test(x):
    # 答 < x である。
    # area = 2sin(a)sin(b)sin(c) < x となるものの個数
    A = np.arange(1,N-1)
    sA = np.sin(A * theta)
    # sin(b)sin(c) > x / 2sA
    # cos((b-c)theta) + cos(a theta) > x/sA
    diff = np.arccos(x/sA - np.cos(A*theta)) / theta
    diff[np.isnan(diff)] = -(N+N)
    upper = np.minimum(N-A-1,(N-A+diff)/2).astype(int)
    lower = (N-A) - upper
    cnt = np.maximum(0, upper - lower + 1).sum()
    return N*((N-1)*(N-2)//2 - cnt) < 3*K

left = 0
right = 4
for _ in range(100):
    x = (left + right)/2
    if test(x):
        left = x
    else:
        right = x
print(x)