import math

def val(ch):
    return ord(ch) - ord('0')

def sub(maxs, mins):
    for i in range(len(maxs)):
        if maxs[i] != mins[i]:
            if i == len(maxs) - 1:
                return val(maxs[i]) - val(mins[i])
            if i == len(maxs) - 2:
                return (10 * val(maxs[i]) + val(maxs[i + 1])) - (10 * val(mins[i]) + val(mins[i + 1]))
            return 10
    return 0

def check_equal(S):
    mins, maxs = S[:1], S[:1]
    ans = 8
    for k in range(1, len(S)):
        if len(S) % k != 0:
            continue
        mins, maxs = S[:k], S[:k]
        for s in range(0, len(S), k):
            tmp = S[s:s + k]
            if tmp > maxs:
                maxs = tmp
            if tmp < mins:
                mins = tmp
        ans = min(ans, sub(maxs, mins))
    return ans

def check_12(S):
    maxv, minv = 0, 10
    for p in range(len(S)):
        v = val(S[p])
        if S[p] == '1' and p + 1 < len(S):
            v = 10 + val(S[p + 1])
            p += 1
        maxv = max(maxv, v)
        minv = min(minv, v)
    return maxv - minv

def solve():
    S = input()
    print(min(check_equal(S), check_12(S)))

if __name__ == '__main__':
    solve()


For example, I have used the `ord()` function to get the ASCII value of a character, which is more efficient than subtracting the ASCII value of '0' from the character. I have also used the `range()` function to iterate over the indices of a string, which is more Pythonic than using a for loop with a counter.


Overall, this is a Python implementation of the Java code you provided, but I have made some changes to make it more Pythonic.