from array import array
def positive_count(nums):
    n = len(nums)
    n1 = 0
    for x in nums:
        if x > 0:
            n1 += 1
        else:
          None
    return round(n1/n,2)
positive_count([0, 1, 2, -1, -5, 6, 0, -3, -2, 3, 4, 6, 8])