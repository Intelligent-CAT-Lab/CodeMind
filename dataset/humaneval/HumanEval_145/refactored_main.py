nums = [1, 11, -1, -11, -12]
def digits_sum(n):
    neg = 1
    if n < 0: n, neg = -1 * n, -1 
    n = [int(i) for i in str(n)]
    n[0] = n[0] * neg
    return sum(n)
print(sorted(nums, key=digits_sum))