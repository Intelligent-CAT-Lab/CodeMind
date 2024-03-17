import sys

def sub(maxs, mins):
    for i in range(len(maxs)):
        if maxs[i]!= mins[i]:
            if i == len(maxs)-1:
                return int(maxs[i]) - int(mins[i])
            if i == len(maxs)-2:
                return (10*int(maxs[i])+int(maxs[i+1])) - (10*int(mins[i])+int(mins[i+1]))
            return 10
    return 0

def checkEqual(S):
    mins, maxs = S[0], S[0]
    ans = 8
    for k in range(1, len(S)):
        if len(S)%k!= 0:
            continue
        mins, maxs = S[0:k], S[0:k]
        for s in range(0, len(S), k):
            tmp = S[s:s+k]
            if tmp > maxs:
                maxs = tmp
            if tmp < mins:
                mins = tmp
        ans = min(ans, sub(maxs, mins))
    return ans

def check12(S):
    maxv, minv = 0, 10
    for p in range(len(S)):
        v = int(S[p])
        if S[p] == '1' and p+1 < len(S):
            v = 10 + int(S[p+1])
            p += 1
        maxv = max(maxv, v)
        minv = min(minv, v)
    return maxv - minv

def solve():
    S = sys.stdin.readline().strip()
    print(min(checkEqual(S), check12(S)))

if __name__ == '__main__':
    solve()