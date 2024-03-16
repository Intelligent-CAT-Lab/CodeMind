import sys

def func(n):
    if n == 1:
        return ['a']
    else:
        prev_list = func(n - 1)
        result = []
        for s in prev_list:
            max_char = 'a'
            for c in s:
                if max_char < c:
                    max_char = c
            for c in range(ord('a'), ord(max_char) + 2):
                result.append(s + chr(c))
        return result

n = int(sys.stdin.readline())
print(*func(n), sep='\n')