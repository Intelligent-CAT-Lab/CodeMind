def func(n):
    list = []
    if n == 1:
        list.append("a")
    else:
        prevList = func(n - 1)
        for s in prevList:
            max = 'a'
            for i in range(len(s)):
                if max < s[i]:
                    max = s[i]
            for c in range(ord(max)+1, ord('z')+1):
                newString = s + chr(c)
                list.append(newString)
    return list

n = int(input())
list = func(n)
for s in list:
    print(s)