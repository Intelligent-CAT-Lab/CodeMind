def func(n):
    if n == 1:
        return ["a"]
    else:
        prevList = func(n - 1)
        result = []
        for s in prevList:
            maxChar = 'a'
            for c in s:
                if c > maxChar:
                    maxChar = c
            for c in range(ord('a'), ord(maxChar) + 2):
                result.append(s + chr(c))
        return result

n = int(input())
result = func(n)
for s in result:
    print(s)