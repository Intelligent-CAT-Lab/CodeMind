from typing import *
def count_nums(arr):
    def digits_sum(n):
        neg = 1
        if n < 0: n, neg = -1 * n, -1 
        n = [int(i) for i in str(n)]
        n[0] = n[0] * neg
        return sum(n)
    return len(list(filter(lambda x: x > 0, [digits_sum(i) for i in arr])))

output = count_nums([1])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_108__0/output.txt", 'w')
file.write(str(output))
file.close()
    