import re

def solve(s):
    s = re.sub(r'egg', 'e', s)
    s = re.sub(r'chicken', 'c', s)
    s = re.sub(r'ee', 'e e', s)
    s = re.sub(r'cc', 'c c', s)
    strs = s.split(' ')
    max_len = 0
    ans = ''
    for i in range(len(strs)):
        if max_len < len(strs[i]):
            max_len = len(strs[i])
            if strs[i][max_len - 1] == 'e':
                ans = 'egg'
            else:
                ans = 'chicken'
    return ans

s = 'eggchickenegg'
print(solve(s))