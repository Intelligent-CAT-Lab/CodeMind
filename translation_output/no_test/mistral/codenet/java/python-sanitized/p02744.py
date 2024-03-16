import sys

def func(n):
    list = []
    if n == 1:
        list.append("a")
    else:
        prev_list = func(n - 1)
        for s in prev_list:
            max_char = ord('a')
            for i in range(len(s)):
                if max_char < ord(s[i]):
                    max_char = ord(s[i])
            for c in range(ord('a'), max_char + 1):
                new_string = s + chr(c)
                list.append(new_string)
    return list

n = int(input())
list = func(n)
for s in list:
    print(s)