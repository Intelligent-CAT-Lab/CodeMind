from typing import *
def order_by_points(nums):
    def digits_sum(n):
        neg = 1
        if n < 0: n, neg = -1 * n, -1 
        n = [int(i) for i in str(n)]
        n[0] = n[0] * neg
        return sum(n)
    return sorted(nums, key=digits_sum)

output = order_by_points([1234,423,463,145,2,423,423,53,6,37,3457,3,56,0,46])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_145__0/output.txt", 'w')
file.write(str(output))
file.close()
    