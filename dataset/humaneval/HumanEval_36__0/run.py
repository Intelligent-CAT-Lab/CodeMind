from typing import *
def fizz_buzz(n: int):
    ns = []
    for i in range(n):
        if i % 11 == 0 or i % 13 == 0:
            ns.append(i)
    s = ''.join(list(map(str, ns)))
    ans = 0
    for c in s:
        ans += (c == '7')
    return ans

output = fizz_buzz(100000)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_36__0/output.txt", 'w')
file.write(str(output))
file.close()
    