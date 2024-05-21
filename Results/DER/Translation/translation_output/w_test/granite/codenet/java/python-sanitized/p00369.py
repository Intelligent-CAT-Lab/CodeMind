def val(ch):
    return ord(ch) - ord('0')

def sub(maxs, mins):
    for i in range(len(maxs)):
        if maxs[i]!= mins[i]:
            if i == len(maxs) - 1:
                return val(maxs[i]) - val(mins[i])
            if i == len(maxs) - 2:
                return (10 * val(maxs[i]) + val(maxs[i + 1])) - (10 * val(mins[i]) + val(mins[i + 1]))
            return 10
    return 0

def check_equal(s):
    mins, maxs = s[:len(s) // 2], s[:len(s) // 2]
    for k in range(1, len(s)):
        if len(s) % k!= 0:
            continue
        mins, maxs = s[:k], s[:k]
        for i in range(0, len(s), k):
            tmp = s[i:i + k]
            if tmp > maxs:
                maxs = tmp
            if tmp < mins:
                mins = tmp
        ans = min(ans, sub(maxs, mins))
    return ans

def check_12(s):
    maxv, minv = 0, 10
    for p in range(len(s)):
        v = val(s[p])
        if s[p] == '1' and p + 1 < len(s):
            v = 10 + val(s[p + 1])
            p += 1
        maxv = max(maxv, v)
        minv = min(minv, v)
    return maxv - minv

def solve():
    s = input()
    print(min(check_equal(s), check_12(s)))

solve()