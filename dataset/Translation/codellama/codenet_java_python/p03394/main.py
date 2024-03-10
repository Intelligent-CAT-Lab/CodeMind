import sys

def solve(n):
    if n == 3:
        return "2 5 63"
    elif n == 4:
        return "2 5 20 63"
    else:
        ans = []
        _2 = 0
        _3 = 0
        _23 = 0
        for i in range(2, n+1):
            if i % 2 == 0 and i % 3 == 0:
                _23 += 1
            elif i % 2 == 0:
                _2 += i
            elif i % 3 == 0:
                _3 += i
            if i % 2 == 0 or i % 3 == 0:
                ans.append(i)
        sn = -1
        for i in range(2, n+1):
            if i % 2 == 0 and (_2 % 3 == 0 or i % 3 != 0) and (_2 + i) % 3 == 0:
                sn = i
                ans.append(i)
                break
        for i in range(2, n+1):
            if i % 3 == 0 and (_3 % 2 == 0 or i % 2 != 0) and i != sn and (_3 + i) % 2 == 0:
                ans.append(i)
                break
        return " ".join(map(str, ans))

n = int(input())
print(solve(n))