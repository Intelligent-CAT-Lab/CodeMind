import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
sys.setrecursionlimit(10 ** 7)

import itertools

N = int(read())

def test(S):
    f,e,s,t,i,v,a,l = 0,0,0,0,0,0,0,0
    for x in S:
        if x == 'F':
            f += 1
        elif x == 'E':
            e += f
        elif x == 'S':
            s += e
        elif x == 'T':
            t += s
        elif x == 'I':
            i += t
        elif x == 'V':
            v += i
        elif x == 'A':
            a += v
        elif x == 'L':
            l += a
    return l

test('FESSSSSSSTIVAL'),test('FFEESSTTIIVVAALL')

A = [x * 200 + 'FESTIVA' for x in [''] + list('FESTIVA')]
B = list(itertools.accumulate(A))

# 各単語の直後にLを挿入する価値
value = [test(word+'L') for word in B]

cnt = [0] * 8
rest = N
for n in range(7,-1,-1):
    q,r = divmod(rest,value[n])
    rest = r
    cnt[n] = q

answer = ''
for x,y in zip(A,cnt):
    answer += x + 'L' * y

print(answer)