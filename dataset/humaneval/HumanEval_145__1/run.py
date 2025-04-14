from typing import *
def order_by_points(nums):
    def digits_sum(n):
        neg = 1
        if n < 0: n, neg = -1 * n, -1 
        n = [int(i) for i in str(n)]
        n[0] = n[0] * neg
        return sum(n)
    return sorted(nums, key=digits_sum)

output = order_by_points([])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_145__1/output.txt", 'w')
file.write(str(output))
file.close()
    